package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

import domain.UserVO;

public class MyUserDAO {
	
	public static Long userId; //로그인 시 받을 세션에 저장된 객체
	public Connection connection; //연결 객체
	public PreparedStatement preparedStatement; //쿼리 관리 객체
	public ResultSet resultSet; // 결과테이블객체
	
//  아이디 중복검사
//	매개변수와 같은것을 DB에서 찾았는데 그 행의 수가 0이라면 중복 없음 1이라면 중복있음
//	default중복 false -> 중복아니면 true
	public boolean checkId(String userIdentification) {
		String query = "SELECT COUNT(USER_ID) FROM TBL_USER WHERE USER_IDENTIFICATION = ?";
		boolean result = false;
		connection = DBConnecter.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userIdentification);
			resultSet = preparedStatement.executeQuery();
			
			resultSet.next();
//			0이면 중복 아님
			result = resultSet.getInt(1) == 0;
			
		} catch (SQLException e) {
			System.out.println("checkId(String) SQL문 오류");
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null ) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		return result;
	}
//  회원가입
//	UserVO로 매개변수를 받아서 다 셋을 해주고
//	리턴은 화면에서 할거니까 없음
	public void signUp(UserVO userVO) {
		String query = "INSERT INTO TBL_USER (USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD, USER_PHONE,"
				+ "USER_EMAIL, USER_ADDRESS, USER_BIRTH, USER_RECOMMENDER_ID)"
				+ "VALUES(SEQ_USER.NEXTVAL, ?, ?, ?, ?, ?, ?, TO_DATE(?, 'YYYY-MM-DD'), ?)";
		
		connection = DBConnecter.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,userVO.getUserIdentification());
			preparedStatement.setString(2,userVO.getUserName());
			preparedStatement.setString(3,userVO.getUserPassword());
			preparedStatement.setString(4,userVO.getUserPhone());
			preparedStatement.setString(5,userVO.getUserEmail());
			preparedStatement.setString(6,userVO.getUserAddress());
			preparedStatement.setString(7,userVO.getUserBirth());
			preparedStatement.setString(8,userVO.getUserRecommenderId());
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("signUp(UserVO) SQL문 오류");
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}
	
//	로그인
	public boolean signIn(String userIdentification, String userPassword) {
		String query = "SELECT USER_ID FROM TBL_USER WHERE USER_IDENTIFICATION = ? AND USER_PASSWORD = ?";
		
		boolean check = false;
		connection = DBConnecter.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userIdentification);
			preparedStatement.setString(2, userPassword);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				userId = resultSet.getLong(1);
				check = true;
			}
		} catch (SQLException e) {
			System.out.println("signIn(String, String) SQL문 오류");
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null ) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		return check;
		
	}
//  회원탈퇴
	   public void delete() {
		      String query = "DELETE FROM TBL_USER WHERE USER_ID=?";
		      connection = DBConnecter.getConnection();
		      try {
		         preparedStatement = connection.prepareStatement(query);
//				로그인 된 상태에서 진행하는 거니까
		         preparedStatement.setLong(1, userId);
		         
		         preparedStatement.executeUpdate();
		         
		      } catch (SQLException e) {
		         System.out.println("delete() SQL문 오류");
		         e.printStackTrace();
		      } catch (Exception e) {
		         e.printStackTrace();
		      } finally {
		         try {
		            if(preparedStatement != null) {
		               preparedStatement.close();
		            }
		            if(connection != null) {
		               connection.close();
		            }
		         } catch (SQLException e) {
		            throw new RuntimeException(e);
		         }
		      }
		   }
	
//  아이디 찾기
	   public String findIdentification(String userPhone) {
		      String query = "SELECT USER_IDENTIFICATION FROM TBL_USER WHERE USER_PHONE = ?";
		      String userIdentification = null;
		      
		      connection = DBConnecter.getConnection();
		      try {
		         preparedStatement = connection.prepareStatement(query);
		         preparedStatement.setString(1, userPhone);

		         resultSet = preparedStatement.executeQuery();
		         
		         if(resultSet.next()) {
		            userIdentification = resultSet.getString(1);
		         }
		         
		      } catch (SQLException e) {
		         System.out.println("findIdentification(String) SQL문 오류");
		         e.printStackTrace();
		      } catch (Exception e) {
		         e.printStackTrace();
		      } finally {
		         try {
		            if(resultSet != null) {
		               resultSet.close();
		            }
		            if(preparedStatement != null) {
		               preparedStatement.close();
		            }
		            if(connection != null) {
		               connection.close();
		            }
		         } catch (SQLException e) {
		            throw new RuntimeException(e);
		         }
		      }
		      
		      return userIdentification;
		   }
//  비밀번호 변경
	   public void updateUserPassword(String userPassword) {
		      String query = "UPDATE TBL_USER SET USER_PASSWORD = ? WHERE USER_ID = ?";

		      connection = DBConnecter.getConnection();
		      try {
		         preparedStatement = connection.prepareStatement(query);
		         preparedStatement.setString(1, new String(Base64.getEncoder().encode(userPassword.getBytes())));
		         preparedStatement.setLong(2, userId);
		         
		         preparedStatement.executeUpdate();
		         
		      } catch (SQLException e) {
		         System.out.println("updateUserPassword(String) SQL문 오류");
		         e.printStackTrace();
		      } catch (Exception e) {
		         e.printStackTrace();
		      } finally {
		         try {
		            if(preparedStatement != null) {
		               preparedStatement.close();
		            }
		            if(connection != null) {
		               connection.close();
		            }
		         } catch (SQLException e) {
		            throw new RuntimeException(e);
		         }
		      }
		   }
//  회원정보 조회
	   public UserVO select(Long userId) {
		      String query = 
		            "SELECT USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD,"
		            + " USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, "
		            + "USER_GENDER, USER_RECOMMENDER_ID "
		            + "FROM TBL_USER WHERE USER_ID = ?";
		      UserVO userVO = null;
		      connection = DBConnecter.getConnection();
		      try {
		         preparedStatement = connection.prepareStatement(query);
		         preparedStatement.setLong(1, userId);
		         resultSet = preparedStatement.executeQuery();
		         
		         if(resultSet.next()) {
		            userVO = new UserVO();
		            userVO.setUserId(resultSet.getLong(1));
		            userVO.setUserIdentification(resultSet.getString(2));
		            userVO.setUserName(resultSet.getString(3));
		            userVO.setUserPassword(resultSet.getString(4));
		            userVO.setUserPhone(resultSet.getString(5));
		            userVO.setUserNickname(resultSet.getString(6));
		            userVO.setUserEmail(resultSet.getString(7));
		            userVO.setUserAddress(resultSet.getString(8));
		            userVO.setUserBirth(resultSet.getString(9));
		            userVO.setUserGender(resultSet.getString(10));
		            userVO.setUserRecommenderId(resultSet.getString(11));
		         }
		         
		      } catch (SQLException e) {
		         System.out.println("select(Long) SQL문 오류");
		         e.printStackTrace();
		      } catch (Exception e) {
		         e.printStackTrace();
		      } finally {
		         try {
		            if(resultSet != null) {
		               resultSet.close();
		            }
		            if(preparedStatement != null) {
		               preparedStatement.close();
		            }
		            if(connection != null) {
		               connection.close();
		            }
		         } catch (SQLException e) {
		            throw new RuntimeException(e);
		         }
		      }
		      
		      return userVO;
		   }
	   
//  회원정보 수정
	   public void update(UserVO userVO) {
		      String query = "UPDATE TBL_USER SET USER_NICKNAME=?, USER_GENDER=?, USER_BIRTH=TO_DATE(?, 'YYYY-MM-DD HH24:MI:SS') WHERE USER_ID=?";
		      connection = DBConnecter.getConnection();
		      try {
		         preparedStatement = connection.prepareStatement(query);
		         preparedStatement.setString(1, userVO.getUserNickname());
		         preparedStatement.setString(2, userVO.getUserGender());
		         preparedStatement.setString(3, userVO.getUserBirth());
		         preparedStatement.setLong(4, userId);
		         
		         preparedStatement.executeUpdate();
		         
		      } catch (SQLException e) {
		         System.out.println("update(UserVO) SQL문 오류");
		         e.printStackTrace();
		      } catch (Exception e) {
		         e.printStackTrace();
		      } finally {
		         try {
		            if(preparedStatement != null) {
		               preparedStatement.close();
		            }
		            if(connection != null) {
		               connection.close();
		            }
		         } catch (SQLException e) {
		            throw new RuntimeException(e);
		         }
		      }
		   }
	   
//  추천수
//  나를 추천한 사람
//  내가 추천한 사람
	
	
	
//	아이디 중복검사
//	db에서 아이디를 받아와서
//	db아이디와 입력한 매개변수 아이디가 같은지 확인하고
//	같으면 중복이니까 false 중복 아니면 true
//	public boolean checkId(String userIdentification) {
////		db에 id가 있는지 확인하는 쿼리문 count는 중복이면 2개일거니까 1이 나와야 중복이 아닌것
//		String query = "SELECT COUNT(USER_ID) FROM TBL_USER WHERE USER_IDENTIFICATION = ?";
//		boolean result = false;
//		connection = DBConnecter.getConnection();
//		try {
////			쿼리문장을 db로 연결
//			preparedStatement =  connection.prepareStatement(query);
////			쿼리문장의 ?에 입력한 매개변수인 아이디 넣기 -> 무조건 1부터 시작 
//			preparedStatement.setString(1, userIdentification);
////			쿼리문장의 결과값 resultSet 객체로 받기
////			1-> 중복 0-> 중복아님
//			resultSet = preparedStatement.executeQuery();
//			
////			다음행(첫번째행)이 존재하면 true 없으면 false를 반환
////			다음행으로 이동
//			resultSet.next();
////			컬럼의 첫번째 값을 int로 받아왔는데 그게 0이다. -> 컬럼의 첫번째: count(user_id)값 0 ->중복아님-> true 아니다 false
//			result = resultSet.getInt(1) == 0;
//			
//		} catch (SQLException e) {
//			System.out.println("checkId(String) SQL문 오류");
//			e.printStackTrace();
//		} finally {
//			try {
//				if(resultSet != null) {
//					resultSet.close();
//				}
//				if(preparedStatement != null) {
//					preparedStatement.close();
//				}
//				if(connection != null) {
//					connection.close();
//				}
//			} catch (SQLException e) {
//				System.out.println("checkId(String) SQL문 오류");
//				throw new RuntimeException(e);
//			}
//		}
//		return result;
//	}
//	
////  회원가입
////	메소드가 실행되면 회원가입이 된것이다.
////	그러므로 return 해주지 않고 boolean 타입으로 
//  public boolean join(UserVO userVO) {
//     String query = "INSERT INTO TBL_USER "
//           + "(USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD, USER_PHONE, USER_NICKNAME, "
//           + "USER_EMAIL, USER_ADDRESS, USER_BIRTH, USER_GENDER, USER_RECOMMENDER_ID) "
//           + "VALUES(SEQ_USER.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//     connection = DBConnecter.getConnection();
//     boolean result = false;
//     
//     try {
//        preparedStatement = connection.prepareStatement(query);
//        
//        preparedStatement.setString(1, userVO.getUserIdentification());
//        preparedStatement.setString(2, userVO.getUserName());
//        preparedStatement.setString(3, userVO.getUserPassword());
////        Base64.getEncode().encode(userVO.getUserPassword().getBytes())
//        preparedStatement.setString(4, userVO.getUserPhone());
//        preparedStatement.setString(5, userVO.getUserNickname());
//        preparedStatement.setString(6, userVO.getUserEmail());
//        preparedStatement.setString(7, userVO.getUserAddress());
//        preparedStatement.setString(8, userVO.getUserBirth());
//        preparedStatement.setString(9, userVO.getUserGender());
//        preparedStatement.setString(10, userVO.getUserRecommenderId());
////		executeUpdate
////      INSERT / DELETE / UPDATE 관련 구문에서는 반영된 레코드의 건수를 반환
////       CREATE / DROP 관련 구문에서는 -1
//        result = preparedStatement.executeUpdate() == 1;
//        
//     } catch (SQLException e) {
//        System.out.println("join(userVO) SQL문 오류");
//        e.printStackTrace();
//     } catch (Exception e) {
//        e.printStackTrace();
//     } finally {
//        try {
//           if(preparedStatement != null) {
//              preparedStatement.close();
//           }
//           if(connection != null) {
//              connection.close();
//           }
//        } catch (SQLException e) {
//           throw new RuntimeException(e);
//        }
//     }
//     
//     return result;
//  }
//  
////	로그인
////  pk값인 아이디를 리턴해주는 것
//  public UserVO login(String userIdentification, String userPassword) {
////	  아이디랑 비번을 입력하면
////	  db의 id, pw와 입력한 매개변수인 id, pw가 맞는지 비교해야 하는데
////	  조회쿼리가 나오면 맞다는 거니까
////	  맞으면 UserVO 리턴
//	  connection = DBConnecter.getConnection();
//	  UserVO userVO = null;
//	  
//	  String query = "SELECT USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD,"
//	  		+ "USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH,"
//	  		+ "USER_GENDER, USER_RECOMMENDER_ID FROM TBL_USER WHERE USER_IDENTIFICATION = ? AND USER_PASSWORD = ?";
//	  
//	  try {
//		preparedStatement = connection.prepareStatement(query);
//		preparedStatement.setString(1, userIdentification);
//		preparedStatement.setString(2, userPassword);
//		resultSet = preparedStatement.executeQuery();
//		
////		다음행이 존재하면 즉 쿼리가 있으면 로그인 가능한거
////		나중에 객체를 써먹어야 하니 이 쿼리를 UserVO에 저장해서 리턴해주기
//		if(resultSet.next()) {
//			userVO = new UserVO();
//			userVO.setUserId(resultSet.getLong(1));
//			userVO.setUserIdentification(resultSet.getString(2));
//			userVO.setUserName(resultSet.getString(3));
//            userVO.setUserPassword(resultSet.getString(4));
//            userVO.setUserPhone(resultSet.getString(5));
//            userVO.setUserNickname(resultSet.getString(6));
//            userVO.setUserEmail(resultSet.getString(7));
//            userVO.setUserAddress(resultSet.getString(8));
//            userVO.setUserBirth(resultSet.getString(9));
//            userVO.setUserGender(resultSet.getString(10));
//            userVO.setUserRecommenderId(resultSet.getString(11));
//		}
//	} catch (SQLException e) {
//		System.out.println("login(String) SQL문 오류");
//		e.printStackTrace();
//	} finally {
//		try {
//			if(resultSet != null) {
//				resultSet.close();
//			}
//			
//			if(preparedStatement != null) {
//				preparedStatement.close();
//			}
//			
//			if(connection != null) {
//				connection.close();
//			}
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		}
//	}
//	  return userVO;
//  }
//  
////	암호화
//  public String encry(String pw) {
//	  String encryPw = "";
//	  for (int i = 0; i < pw.length(); i++) {
//		  encryPw += (char)pw.charAt(i) * KEY;
//	}
//	  return encryPw;
//  }
//  
////	회원탈퇴
//  public boolean unregister(UserVO userVO) {
////	  회원 정보 삭제 쿼리문 작성 중복 없는 USER_ID로 찾아서 삭제
//      String query = "DELETE FROM TBL_USER WHERE USER_ID = ?";
//      connection = DBConnecter.getConnection();
//      boolean result = false;
//      
//      try {
//         preparedStatement = connection.prepareStatement(query);
//         preparedStatement.setLong(1, userVO.getUserId());
//// 		executeUpdate
////       INSERT / DELETE / UPDATE 관련 구문에서는 반영된 레코드의 건수를 반환
////        CREATE / DROP 관련 구문에서는 -1
//         result = preparedStatement.executeUpdate() == 1;
//         
//      } catch (SQLException e) {
//         System.out.println("unregister(UserVO) SQL문 오류");
//         e.printStackTrace();
//      } catch (Exception e) {
//         e.printStackTrace();
//      } finally {
//         try {
//            if(preparedStatement != null) {
//               preparedStatement.close();
//            }
//            if(connection != null) {
//               connection.close();
//            }
//         } catch (SQLException e) {
//            throw new RuntimeException(e);
//         }
//      }
//   
//      return result;
//   }
////	아이디찾기
//  public String findID(String userPhone) {
//      String query = "SELECT USER_IDENTIFICATION FROM TBL_USER WHERE USER_PHONE = ?";
//      connection = DBConnecter.getConnection();
//      String result = null;
//      
//      try {
//         preparedStatement = connection.prepareStatement(query);
//         preparedStatement.setString(1, userPhone);
//         
//         resultSet = preparedStatement.executeQuery();
//         resultSet.next();
//         result = resultSet.getString(1);
//      } catch (SQLException e) {
//         System.out.println("find(String) SQL문 오류");
//         e.printStackTrace();
//      } catch (Exception e) {
//         e.printStackTrace();
//      } finally {
//         try {
//            if(resultSet != null) {
//               resultSet.close();
//            }
//            if(preparedStatement != null) {
//               preparedStatement.close();
//            }
//            if(connection != null) {
//               connection.close();
//            }
//         } catch (SQLException e) {
//            throw new RuntimeException(e);
//         }
//      }
//   
//      return result;
//   }
////	비밀번호변경
//  public boolean changePw(String userIdentification, String password) {
//      String query = "UPDATE TBL_USER SET USER_PASSWORD = ? WHERE USER_IDENTIFICATION = ?";
//      connection = DBConnecter.getConnection();
//      boolean result = false;
//      
//      try {
//         preparedStatement = connection.prepareStatement(query);
//         preparedStatement.setString(1, encry(password));
//         preparedStatement.setString(2, userIdentification);
//         
//         result = preparedStatement.executeUpdate() == 1;
//      } catch (SQLException e) {
//         System.out.println("changePw(userVO) SQL문 오류");
//         e.printStackTrace();
//      } catch (Exception e) {
//         e.printStackTrace();
//      } finally {
//         try {
//            if(preparedStatement != null) {
//               preparedStatement.close();
//            }
//            if(connection != null) {
//               connection.close();
//            }
//         } catch (SQLException e) {
//            throw new RuntimeException(e);
//         }
//      }
//      
//      return result;
//   }
////	회원정보 수정
//  public void updateUser(UserVO userVO) {
//      String query = "UPDATE TBL_USER"
//            + " SET USER_IDENTIFICATION = ?, USER_PHONE= ?, USER_NICKNAME= ?, USER_ADDRESS= ?, USER_EMAIL = ? "
//            + "WHERE USER_ID = ?";
//      connection = DBConnecter.getConnection();
//      
//      System.out.println(userVO);
//      try {
//         preparedStatement = connection.prepareStatement(query);
//         
//         preparedStatement.setString(1, userVO.getUserIdentification());
//         preparedStatement.setString(2, userVO.getUserPhone());
//         preparedStatement.setString(3, userVO.getUserNickname());
//         preparedStatement.setString(4, userVO.getUserAddress());
//         preparedStatement.setString(5, userVO.getUserEmail());
//         preparedStatement.setLong(6, userVO.getUserId());
//         
//         preparedStatement.executeUpdate();
//         
//      } catch (SQLException e) {
//         System.out.println("updateUser(UserVO) SQL문 오류");
//         e.printStackTrace();
//      } catch (Exception e) {
//         e.printStackTrace();
//      } finally {
//         try {
//            if(preparedStatement != null) {
//               preparedStatement.close();
//            }
//            if(connection != null) {
//               connection.close();
//            }
//         } catch (SQLException e) {
//            throw new RuntimeException(e);
//         }
//      }
//   }
////	회원정보 조회
//	public UserVO select(Long userId) {
//		String query = "SELECT USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, USER_GENDER, USER_RECOMMENDER_ID FROM TBL_USER;\r\n"
//				+ "FROM TBL_USER WHERE USER_ID = ?";
//
//		UserVO userVO = null;
//		connection = DBConnecter.getConnection();
//
//		try {
//			preparedStatement = connection.prepareStatement(query);
//			preparedStatement.setLong(1, userId);
//			resultSet = preparedStatement.executeQuery();
//
//			if (resultSet.next()) {
//
//				userVO = new UserVO();
//				userVO.setUserId(resultSet.getLong(1));
//				userVO.setUserIdentification(resultSet.getString(2));
//				userVO.setUserName(resultSet.getString(3));
//				userVO.setUserPassword(resultSet.getString(3));
//				userVO.setUserPhone(resultSet.getString(4));
//				userVO.setUserNickname(resultSet.getString(5));
//				userVO.setUserEmail(resultSet.getString(6));
//				userVO.setUserAddress(resultSet.getString(7));
//				userVO.setUserBirth(resultSet.getString(8));
//				userVO.setUserGender(resultSet.getString(9));
//				userVO.setUserRecommenderId(resultSet.getString(11));
//
//				resultSet.getLong(1);
//				resultSet.getString(2);
//				resultSet.getString(3);
//				resultSet.getString(4);
//				resultSet.getString(5);
//				resultSet.getString(6);
//				resultSet.getString(7);
//				resultSet.getString(8);
//				resultSet.getString(9);
//				resultSet.getBoolean(10);
//				resultSet.getString(11);
//
//			}
//		} catch (SQLException e) {
//			System.out.println("select(Long) SQL문 오류");
//			e.printStackTrace();
//		}
//		return userVO;
//	}
//
////	추천수
//	public int recomendCount(String identification) {
//	      String query = "SELECT COUNT(USER_RECOMMENDER_ID) FROM TBL_USER WHERE USER_RECOMMENDER_ID = ?";
//	      int result = 0;
//	      connection = DBConnecter.getConnection();
//	      
//	      try {
//	         preparedStatement = connection.prepareStatement(query);
//	         preparedStatement.setString(1, identification);
//	         resultSet = preparedStatement.executeQuery();
//	         
//	         resultSet.next();
//	         result = resultSet.getInt(1);
//
//	      } catch (SQLException e) {
//	         System.out.println("recomendCount() SQL문 오류");
//	         e.printStackTrace();
//	      } catch (Exception e) {
//	         e.printStackTrace();
//	      } finally {
//	         try {
//	            if(resultSet != null) {
//	               resultSet.close();
//	            }
//	            if(preparedStatement != null) {
//	               preparedStatement.close();
//	            }
//	            if(connection != null) {
//	               connection.close();
//	            }
//	         } catch (SQLException e) {
//	            throw new RuntimeException(e);
//	         }
//	      }
//	   
//	      return result;
//	   }
////	나를 추천한 사람
//  public ArrayList<UserVO> recomendForMe(UserVO userVO) {
//     String query =
//           "SELECT USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD,"
//           + " USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, "
//           + "USER_GENDER, USER_RECOMMENDER_ID "
//           + "FROM TBL_USER WHERE  WHERE USER_RECOMMENDER_ID = ?";
////     나를 추천한 사람이 몇명인지 모르니 배열로
//     ArrayList<UserVO> arData = null;
//     UserVO user = null;
//     connection = DBConnecter.getConnection();
//     try {
//        preparedStatement = connection.prepareStatement(query);
//        preparedStatement.setString(1, userVO.getUserIdentification());
//        resultSet = preparedStatement.executeQuery();
//        arData = new ArrayList<UserVO>();
//        while(resultSet.next()) {
//           user = new UserVO();
//           user.setUserId(resultSet.getLong(1));
//           user.setUserIdentification(resultSet.getString(2));
//           user.setUserName(resultSet.getString(3));
//           user.setUserPassword(resultSet.getString(4));
//           user.setUserPhone(resultSet.getString(5));
//           user.setUserNickname(resultSet.getString(6));
//           user.setUserEmail(resultSet.getString(7));
//           user.setUserAddress(resultSet.getString(8));
//           user.setUserBirth(resultSet.getString(9));
//           user.setUserGender(resultSet.getString(10));
//           user.setUserRecommenderId(resultSet.getString(11));
//           arData.add(user);
//        }
//        
//     } catch (SQLException e) {
//        System.out.println("recomendForMe(userVO) SQL문 오류");
//        e.printStackTrace();
//     } catch (Exception e) {
//        e.printStackTrace();
//     } finally {
//        try {
//           if(resultSet != null) {
//              resultSet.close();
//           }
//           if(preparedStatement != null) {
//              preparedStatement.close();
//           }
//           if(connection != null) {
//              connection.close();
//           }
//        } catch (SQLException e) {
//           throw new RuntimeException(e);
//        }
//     }
//     
//     return arData;
//  }
//  
////  내가 추천한 사람
////  추천인 아이디
//  public UserVO recomendForOther(UserVO userVO) {
//     String query ="SELECT USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD,\""
//     		+ " USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, \""
//     		+ "USER_GENDER, USER_RECOMMENDER_ID \""
//     		+ "FROM TBL_USER WHERE USER_RECOMMENDER_ID = ? AND USER_ID = ?";
//     connection = DBConnecter.getConnection();
//     UserVO user = null;
//     try {
//        preparedStatement = connection.prepareStatement(query);
//        preparedStatement.setString(1, userVO.getUserIdentification());
//        resultSet = preparedStatement.executeQuery();
//        
//        resultSet.next();
//        while(resultSet.next()) {
//           user = new UserVO();
//           user.setUserId(resultSet.getLong(1));
//           user.setUserIdentification(resultSet.getString(2));
//           user.setUserName(resultSet.getString(3));
//           user.setUserPassword(resultSet.getString(4));
//           user.setUserPhone(resultSet.getString(5));
//           user.setUserNickname(resultSet.getString(6));
//           user.setUserEmail(resultSet.getString(7));
//           user.setUserAddress(resultSet.getString(8));
//           user.setUserBirth(resultSet.getString(9));
//           user.setUserGender(resultSet.getString(10));
//           user.setUserRecommenderId(resultSet.getString(11));
//        }
//        
//     } catch (SQLException e) {
//        System.out.println("recomendForMe(userVO) SQL문 오류");
//        e.printStackTrace();
//     } catch (Exception e) {
//        e.printStackTrace();
//     } finally {
//        try {
//           if(resultSet != null) {
//              resultSet.close();
//           }
//           if(preparedStatement != null) {
//              preparedStatement.close();
//           }
//           if(connection != null) {
//              connection.close();
//           }
//        } catch (SQLException e) {
//           throw new RuntimeException(e);
//        }
//     }
//     
//     return user;
//     
//  }

}
	      
