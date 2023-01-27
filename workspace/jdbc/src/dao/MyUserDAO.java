package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

import domain.UserVO;

public class MyUserDAO {
	
	public static Long userId; //�α��� �� ���� ���ǿ� ����� ��ü
	public Connection connection; //���� ��ü
	public PreparedStatement preparedStatement; //���� ���� ��ü
	public ResultSet resultSet; // ������̺�ü
	
//  ���̵� �ߺ��˻�
//	�Ű������� �������� DB���� ã�Ҵµ� �� ���� ���� 0�̶�� �ߺ� ���� 1�̶�� �ߺ�����
//	default�ߺ� false -> �ߺ��ƴϸ� true
	public boolean checkId(String userIdentification) {
		String query = "SELECT COUNT(USER_ID) FROM TBL_USER WHERE USER_IDENTIFICATION = ?";
		boolean result = false;
		connection = DBConnecter.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userIdentification);
			resultSet = preparedStatement.executeQuery();
			
			resultSet.next();
//			0�̸� �ߺ� �ƴ�
			result = resultSet.getInt(1) == 0;
			
		} catch (SQLException e) {
			System.out.println("checkId(String) SQL�� ����");
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
//  ȸ������
//	UserVO�� �Ű������� �޾Ƽ� �� ���� ���ְ�
//	������ ȭ�鿡�� �ҰŴϱ� ����
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
			System.out.println("signUp(UserVO) SQL�� ����");
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
	
//	�α���
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
			System.out.println("signIn(String, String) SQL�� ����");
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
//  ȸ��Ż��
	   public void delete() {
		      String query = "DELETE FROM TBL_USER WHERE USER_ID=?";
		      connection = DBConnecter.getConnection();
		      try {
		         preparedStatement = connection.prepareStatement(query);
//				�α��� �� ���¿��� �����ϴ� �Ŵϱ�
		         preparedStatement.setLong(1, userId);
		         
		         preparedStatement.executeUpdate();
		         
		      } catch (SQLException e) {
		         System.out.println("delete() SQL�� ����");
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
	
//  ���̵� ã��
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
		         System.out.println("findIdentification(String) SQL�� ����");
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
//  ��й�ȣ ����
	   public void updateUserPassword(String userPassword) {
		      String query = "UPDATE TBL_USER SET USER_PASSWORD = ? WHERE USER_ID = ?";

		      connection = DBConnecter.getConnection();
		      try {
		         preparedStatement = connection.prepareStatement(query);
		         preparedStatement.setString(1, new String(Base64.getEncoder().encode(userPassword.getBytes())));
		         preparedStatement.setLong(2, userId);
		         
		         preparedStatement.executeUpdate();
		         
		      } catch (SQLException e) {
		         System.out.println("updateUserPassword(String) SQL�� ����");
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
//  ȸ������ ��ȸ
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
		         System.out.println("select(Long) SQL�� ����");
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
	   
//  ȸ������ ����
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
		         System.out.println("update(UserVO) SQL�� ����");
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
	   
//  ��õ��
//  ���� ��õ�� ���
//  ���� ��õ�� ���
	
	
	
//	���̵� �ߺ��˻�
//	db���� ���̵� �޾ƿͼ�
//	db���̵�� �Է��� �Ű����� ���̵� ������ Ȯ���ϰ�
//	������ �ߺ��̴ϱ� false �ߺ� �ƴϸ� true
//	public boolean checkId(String userIdentification) {
////		db�� id�� �ִ��� Ȯ���ϴ� ������ count�� �ߺ��̸� 2���ϰŴϱ� 1�� ���;� �ߺ��� �ƴѰ�
//		String query = "SELECT COUNT(USER_ID) FROM TBL_USER WHERE USER_IDENTIFICATION = ?";
//		boolean result = false;
//		connection = DBConnecter.getConnection();
//		try {
////			���������� db�� ����
//			preparedStatement =  connection.prepareStatement(query);
////			���������� ?�� �Է��� �Ű������� ���̵� �ֱ� -> ������ 1���� ���� 
//			preparedStatement.setString(1, userIdentification);
////			���������� ����� resultSet ��ü�� �ޱ�
////			1-> �ߺ� 0-> �ߺ��ƴ�
//			resultSet = preparedStatement.executeQuery();
//			
////			������(ù��°��)�� �����ϸ� true ������ false�� ��ȯ
////			���������� �̵�
//			resultSet.next();
////			�÷��� ù��° ���� int�� �޾ƿԴµ� �װ� 0�̴�. -> �÷��� ù��°: count(user_id)�� 0 ->�ߺ��ƴ�-> true �ƴϴ� false
//			result = resultSet.getInt(1) == 0;
//			
//		} catch (SQLException e) {
//			System.out.println("checkId(String) SQL�� ����");
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
//				System.out.println("checkId(String) SQL�� ����");
//				throw new RuntimeException(e);
//			}
//		}
//		return result;
//	}
//	
////  ȸ������
////	�޼ҵ尡 ����Ǹ� ȸ�������� �Ȱ��̴�.
////	�׷��Ƿ� return ������ �ʰ� boolean Ÿ������ 
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
////      INSERT / DELETE / UPDATE ���� ���������� �ݿ��� ���ڵ��� �Ǽ��� ��ȯ
////       CREATE / DROP ���� ���������� -1
//        result = preparedStatement.executeUpdate() == 1;
//        
//     } catch (SQLException e) {
//        System.out.println("join(userVO) SQL�� ����");
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
////	�α���
////  pk���� ���̵� �������ִ� ��
//  public UserVO login(String userIdentification, String userPassword) {
////	  ���̵�� ����� �Է��ϸ�
////	  db�� id, pw�� �Է��� �Ű������� id, pw�� �´��� ���ؾ� �ϴµ�
////	  ��ȸ������ ������ �´ٴ� �Ŵϱ�
////	  ������ UserVO ����
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
////		�������� �����ϸ� �� ������ ������ �α��� �����Ѱ�
////		���߿� ��ü�� ��Ծ�� �ϴ� �� ������ UserVO�� �����ؼ� �������ֱ�
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
//		System.out.println("login(String) SQL�� ����");
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
////	��ȣȭ
//  public String encry(String pw) {
//	  String encryPw = "";
//	  for (int i = 0; i < pw.length(); i++) {
//		  encryPw += (char)pw.charAt(i) * KEY;
//	}
//	  return encryPw;
//  }
//  
////	ȸ��Ż��
//  public boolean unregister(UserVO userVO) {
////	  ȸ�� ���� ���� ������ �ۼ� �ߺ� ���� USER_ID�� ã�Ƽ� ����
//      String query = "DELETE FROM TBL_USER WHERE USER_ID = ?";
//      connection = DBConnecter.getConnection();
//      boolean result = false;
//      
//      try {
//         preparedStatement = connection.prepareStatement(query);
//         preparedStatement.setLong(1, userVO.getUserId());
//// 		executeUpdate
////       INSERT / DELETE / UPDATE ���� ���������� �ݿ��� ���ڵ��� �Ǽ��� ��ȯ
////        CREATE / DROP ���� ���������� -1
//         result = preparedStatement.executeUpdate() == 1;
//         
//      } catch (SQLException e) {
//         System.out.println("unregister(UserVO) SQL�� ����");
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
////	���̵�ã��
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
//         System.out.println("find(String) SQL�� ����");
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
////	��й�ȣ����
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
//         System.out.println("changePw(userVO) SQL�� ����");
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
////	ȸ������ ����
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
//         System.out.println("updateUser(UserVO) SQL�� ����");
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
////	ȸ������ ��ȸ
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
//			System.out.println("select(Long) SQL�� ����");
//			e.printStackTrace();
//		}
//		return userVO;
//	}
//
////	��õ��
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
//	         System.out.println("recomendCount() SQL�� ����");
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
////	���� ��õ�� ���
//  public ArrayList<UserVO> recomendForMe(UserVO userVO) {
//     String query =
//           "SELECT USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD,"
//           + " USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, "
//           + "USER_GENDER, USER_RECOMMENDER_ID "
//           + "FROM TBL_USER WHERE  WHERE USER_RECOMMENDER_ID = ?";
////     ���� ��õ�� ����� ������� �𸣴� �迭��
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
//        System.out.println("recomendForMe(userVO) SQL�� ����");
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
////  ���� ��õ�� ���
////  ��õ�� ���̵�
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
//        System.out.println("recomendForMe(userVO) SQL�� ����");
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
	      
