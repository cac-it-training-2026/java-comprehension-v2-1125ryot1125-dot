package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する
		ConsoleReader console = new ConsoleReader();
		Member member1 = new Member();
		Member member2 = new Member();
		member1 = Member.getInstance(1, "PasswOrd", "Miura Manabu", 28, 2);
		member2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		List<Member> members = new ArrayList<>();
		members.add(member1);
		members.add(member2);

		MemberManager.showAllMembers(members);

		System.out.println("===パスワードを変更します===");

		try {
			System.out.print("input target id>>");
			int id = console.inputNumber();

			System.out.print("input new password>>");
			String password = console.inputString();

			MemberManager.updatePassword(members, id, password);

		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
			return;
		}

		System.out.println("---SHOW DATA---");
		MemberManager.showAllMembers(members);

	}

}
