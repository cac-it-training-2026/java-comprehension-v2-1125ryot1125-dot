package q02_advanced.question03;

/**
 * MemberStorageにアクセスし、ログイン処理を行う
 */
class LoginService {

	/**
	 * memberStorage Memberクラスのリスト一覧
	 */
	private MemberStorage memberStorage;

	//TODO ここから処理を記述

	/**
	 * @param memberStorage
	 */
	public LoginService(MemberStorage memberStorage) {
		this.memberStorage = memberStorage;
	}

	//	public Member doLogin(int id, String password) {
	//
	//		for (Member member : members) {
	//			if (member.getId() == id && member.getPassword().equals(password)) {
	//				return member;
	//			}
	//		}
	//
	//		// 見つからない場合
	//		return null;
	//	}

}
