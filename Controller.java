package lab1.ex2;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Controller {
	public static void inputEmployer(ArrayList<Employee> list, Scanner sc) {
		while (true) {
			System.out.println("Nhap so luong nhan vien can quan ly: ");
			String n = sc.next();
			if (isNumber(n)) {
				for (int i = 1; i <= Integer.parseInt(n);) {
					System.out.print("Type: ");
					String type = sc.next();
					if (type.equals("0") || type.equals("1") || type.equals("2")) {
						String id;
						while (true) {
							System.out.print("Id: ");
							id = sc.next();
							if (checkEmployer(id, list) != -1) {
								System.out.println("id da ton tai!");
							} else {
								break;
							}
						}
						System.out.print("Full Name: ");
						String fullName = sc.next();
						while (true) {
							if (checkValidName(fullName)) {
								break;
							} else {
								System.out.println("Fullname ko hop le!");
								System.out.println("Full Name: ");
								fullName = sc.next();
							}
						}
						System.out.print("Birthday: ");
						String birthDay = sc.next();
						while (true) {
							if (checkValidDate(birthDay)) {
								break;
							} else {
								System.out.println("Birhtday ko hop le!");
								System.out.println("Birthday: ");
								birthDay = sc.next();
							}
						}
						System.out.print("Phone: ");
						String phone = sc.next();
						while (true) {
							if (checkValidPhone(phone)) {
								break;
							} else {
								System.out.println("phone ko hop le!");
								System.out.print("Phone: ");
								phone = sc.next();
							}
						}
						System.out.print("Email: ");
						String email = sc.next();
						while (true) {
							if (checkValidEmail(email)) {
								break;
							} else {
								System.out.println("Email ko hop le!");
								System.out.print("Email: ");
								email = sc.next();
							}
						}
						if (type.equals("0")) {
							list.add(new Experienced(id, fullName, birthDay, phone, email));
							System.out.print("ExpYear: ");
							String exp = sc.next();
							System.out.print("ProSkill: ");
							String skill = sc.next();
							((Experienced) list.get(Employee.employeeCount - 1)).showMe(exp, skill);
							System.out.println("Nhap bang cap cua nhan vien id " + id);
							System.out.print("Nhap so luong bang: ");
							String num = sc.next();
							if (isNumber(num)) {
								for (int j = 1; j <= Integer.parseInt(num); j++) {
									System.out.print("ID: ");
									String id_cer = sc.next();
									System.out.print("Name: ");
									String name_cer = sc.next();
									System.out.print("Rank: ");
									String rank_cer = sc.next();
									System.out.print("Date: ");
									String date_cer = sc.next();
									while (true) {
										if (checkValidDate(date_cer)) {
											break;
										} else {
											System.out.println("Date_cer ko hop le!");
											System.out.println("Date_cer: ");
											date_cer = sc.next();
										}
									}
									((Experienced) list.get(Employee.employeeCount - 1)).setCertificate(id_cer,
											name_cer, rank_cer, date_cer);
								}
							} else {
								System.out.println("So luong khong hop le!");
							}
						} else if (type.equals("1")) {
							list.add(new Fresher(id, fullName, birthDay, phone, email));
							System.out.print("Graduation_date: ");
							String graduation_date = sc.next();
							while (true) {
								if (checkValidDate(graduation_date)) {
									break;
								} else {
									System.out.println("Graduation_date ko hop le!");
									System.out.print("Graduation_date: ");
									graduation_date = sc.next();
								}
							}
							System.out.print("Graduation_rank: ");
							String graduation_rank = sc.next();
							System.out.print("Education: ");
							String education = sc.next();
							((Fresher) list.get(Employee.employeeCount - 1)).showMe(graduation_date, graduation_rank,
									education);
							System.out.println("Nhap bang cap cua nhan vien id " + id);
							System.out.print("Nhap so luong bang: ");
							String num = sc.next();
							if (isNumber(num)) {
								for (int j = 1; j <= Integer.parseInt(num); j++) {
									System.out.print("ID: ");
									String id_cer = sc.next();
									System.out.print("Name: ");
									String name_cer = sc.next();
									System.out.print("Rank: ");
									String rank_cer = sc.next();
									System.out.print("Date: ");
									String date_cer = sc.next();
									while (true) {
										if (checkValidDate(date_cer)) {
											break;
										} else {
											System.out.println("Date_cer ko hop le!");
											System.out.println("Date_cer: ");
											date_cer = sc.next();
										}
									}
									((Fresher) list.get(Employee.employeeCount - 1)).setCertificate(id_cer, name_cer,
											rank_cer, date_cer);
								}
							} else {
								System.out.println("So luong khong hop le!");
							}
						} else {
							list.add(new Intern(id, fullName, birthDay, phone, email));
							System.out.print("Majors: ");
							String majors = sc.next();
							System.out.print("Semester: ");
							String semester = sc.next();
							System.out.print("University: ");
							String university = sc.next();
							((Intern) list.get(Employee.employeeCount - 1)).showMe(majors, semester, university);
							System.out.println("Nhap bang cap cua nhan vien id " + id);
							System.out.print("Nhap so luong bang: ");
							String num = sc.next();
							if (isNumber(num)) {
								for (int j = 1; j <= Integer.parseInt(num); j++) {
									System.out.print("ID: ");
									String id_cer = sc.next();
									System.out.print("Name: ");
									String name_cer = sc.next();
									System.out.print("Rank: ");
									String rank_cer = sc.next();
									System.out.print("Date: ");
									String date_cer = sc.next();
									while (true) {
										if (checkValidDate(date_cer)) {
											break;
										} else {
											System.out.println("Date_cer ko hop le!");
											System.out.println("Date_cer: ");
											date_cer = sc.next();
										}
									}
									((Intern) list.get(Employee.employeeCount - 1)).setCertificate(id_cer, name_cer,
											rank_cer, date_cer);
								}
							} else {
								System.out.println("So luong khong hop le!");
							}
						}
						i++;
					} else {
						System.out.println("Type khong hop le!");
					}
				}
				break;
			} else {
				System.out.println("So luong khong hop le!");
			}
		}
	}

	public static void fixEmployer(ArrayList<Employee> list, Scanner sc) {
		System.out.println("Nhap id cua nhan vien can sua: ");
		String id = sc.next();
		int index = checkEmployer(id, list);

		if (index != -1) {
			int bool = 0;
			while (bool < 1) {
				System.out.println("Moi lua chon: ");
				System.out.println("1.Fix id");
				System.out.println("2.Fix fullname");
				System.out.println("3.Fix birthday:");
				System.out.println("4.Fix phone");
				System.out.println("5.Fix email");
				System.out.println("6.Fix employeeType");
				System.out.println("7.Xoa nhan vien");
				System.out.println("8.Exit");
				System.out.println("-----------------------------");

				String choice = sc.next();
				switch (choice) {
				case "1":
					String new_id = sc.next();
					list.get(index).setId(new_id);
					break;
				case "2":
					String new_name = sc.next();
					while (true) {
						if (checkValidName(new_name)) {
							break;
						} else {
							System.out.println("Fullname ko hop le!");
							System.out.println("Full Name: ");
							new_name = sc.next();
						}
					}
					list.get(index).setFullName(new_name);
					break;
				case "3":
					String new_birthday = sc.next();
					while (true) {
						if (checkValidDate(new_birthday)) {
							break;
						} else {
							System.out.println("Birhtday ko hop le!");
							System.out.println("Birthday: ");
							new_birthday = sc.next();
						}
					}
					list.get(index).setBirthDay(new_birthday);
				case "4":
					String new_phone = sc.next();
					while (true) {
						if (checkValidPhone(new_phone)) {
							break;
						} else {
							System.out.println("phone ko hop le!");
							System.out.print("Phone: ");
							new_phone = sc.next();
						}
					}
					list.get(index).setPhone(new_phone);
					break;
				case "5":
					String new_email = sc.next();
					while (true) {
						if (checkValidEmail(new_email)) {
							break;
						} else {
							System.out.println("Email ko hop le!");
							System.out.print("Email: ");
							new_email = sc.next();
						}
					}
					list.get(index).setEmail(new_email);
					break;
				case "6":
					int new_type = sc.nextInt();
					list.get(index).setEmployeeType(new_type);
					if (new_type == 0) {
						System.out.print("ExpYear: ");
						String exp = sc.next();
						System.out.print("ProSkill: ");
						String skill = sc.next();
						String new_ID = list.get(index).getId();
						String new_Name = list.get(index).getFullName();
						String new_BirthDay = list.get(index).getBirthDay();
						String new_PHONE = list.get(index).getPhone();
						String new_EMAIL = list.get(index).getEmail();
						list.remove(index);
						Employee.employeeCount--;
						list.add(new Experienced(new_ID, new_Name, new_BirthDay, new_PHONE, new_EMAIL));
						((Experienced) list.get(index)).showMe(exp, skill);
						index++;
					} else if (new_type == 1) {
						System.out.print("Graduation_date: ");
						String graduation_date = sc.next();
						while (true) {
							if (checkValidDate(graduation_date)) {
								break;
							} else {
								System.out.println("Graduation_date ko hop le!");
								System.out.print("Graduation_date: ");
								graduation_date = sc.next();
							}
						}
						System.out.print("Graduation_rank: ");
						String graduation_rank = sc.next();
						System.out.print("Education: ");
						String education = sc.next();
						String new_ID = list.get(index).getId();
						String new_Name = list.get(index).getFullName();
						String new_BirthDay = list.get(index).getBirthDay();
						String new_PHONE = list.get(index).getPhone();
						String new_EMAIL = list.get(index).getEmail();
						list.remove(index);
						Employee.employeeCount--;
						list.add(new Fresher(new_ID, new_Name, new_BirthDay, new_PHONE, new_EMAIL));
						((Fresher) list.get(index)).showMe(graduation_date, graduation_rank, education);
						index++;
					} else if (new_type == 2) {
						System.out.print("Majors: ");
						String majors = sc.next();
						System.out.print("Semester: ");
						String semester = sc.next();
						System.out.print("University: ");
						String university = sc.next();
						String new_ID = list.get(index).getId();
						String new_Name = list.get(index).getFullName();
						String new_BirthDay = list.get(index).getBirthDay();
						String new_PHONE = list.get(index).getPhone();
						String new_EMAIL = list.get(index).getEmail();
						list.remove(index);
						Employee.employeeCount--;
						list.add(new Intern(new_ID, new_Name, new_BirthDay, new_PHONE, new_EMAIL));
						((Intern) list.get(index)).showMe(majors, semester, university);
					} else {
						System.out.println("Type khong hop le!");
					}
					break;
				case "7":
					list.remove(index);
					Employee.employeeCount--;
					bool = 2;
					if (isEmpty(list)) {
						System.out.println("Danh sach nhan vien trong");
					}
					break;
				case "8":
					bool = 2;
					break;
				default:
					System.out.println("Lua chon ko hop le!");
				}

			}
		} else {
			System.out.println("Id khong hop le!");
		}
	}

	public static void sortType(ArrayList<Employee> list, Scanner sc) {
		int bool = 0;
		while (bool < 1) {
			System.out.println("Lua chon Type muon tim kiem: ");
			System.out.println("1. intern");
			System.out.println("2. experienced");
			System.out.println("3. fresher");
			System.out.println("4. exit");
			System.out.println("-----------------------------");

			String type = sc.next();
			switch (type) {
			case "1":
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getEmployeeType() == 2) {
						list.get(i).showInfo();
					}
				}
				break;
			case "2":
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getEmployeeType() == 0) {
						list.get(i).showInfo();
					}
				}
				break;
			case "3":
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getEmployeeType() == 1) {
						list.get(i).showInfo();
					}
				}
				break;
			case "4":
				bool = 2;
				break;

			default:
				System.out.println("Lua chon ko hop le");
			}

		}
	}

	public static void printEmployer(ArrayList<Employee> list) {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).showInfo();
		}
	}

	public static void showCer(ArrayList<Employee> list, String id_emp) {

		for (int i = 0; i < list.size(); i++) {
			if (id_emp.equals(list.get(i).getId())) {
				if (list.get(i).getEmployeeType() == 0) {
					((Experienced) list.get(i)).showCertificate(id_emp);
				} else if (list.get(i).getEmployeeType() == 1) {
					((Fresher) list.get(i)).showCertificate(id_emp);
				} else if (list.get(i).getEmployeeType() == 2) {

					((Intern) list.get(i)).showCertificate(id_emp);
				}
			}
		}
	}

	public static int checkEmployer(String id, ArrayList<Employee> list) {
		for (int i = 0; i < list.size(); i++) {
			if (id.equals(list.get(i).getId())) {
				return i;
			}
		}
		return -1;
	}

	public static boolean checkValidDate(String birthDay) {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df.setLenient(false);
		try {
			df.parse(birthDay);
			return true;
		} catch (ParseException e) {
			return false;
		}
	}

	public static boolean checkValidEmail(String email) {
		String rePattern = "^(.+)@([a-zA-z]+)\\.{1}([a-zA-z]+)$";
		return Pattern.compile(rePattern).matcher(email).matches();
	}

	public static boolean checkValidName(String name) {
		String rePattern = "^[a-zA-z]+$";
		return Pattern.compile(rePattern).matcher(name).matches();
	}

	public static boolean checkValidPhone(String phone) {
		String rePattern = "^[0-9]{10}$";
		return Pattern.compile(rePattern).matcher(phone).matches();
	}

	public static boolean isNumber(String s) {
		String rePattern = "^[0-9]+$";
		return Pattern.compile(rePattern).matcher(s).matches();
	}

	public static boolean isEmpty(ArrayList<Employee> list) {
		if (list.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public static void menu(ArrayList<Employee> list, Scanner sc) {
		int bool = 0;
		while (bool < 1) {
			System.out.println("Day la phan mem quan li nhan vien");
			System.out.println("Moi nguoi dung chon cac thao tac");
			System.out.println("1. Them nhan vien vao danh sach quan ly");
			System.out.println("2. Chinh sua thong tin nhan vien");
			System.out.println("3. Sap xep nhan vien theo Type");
			System.out.println("4. In danh sach tat ca nhan vien");
			System.out.println("5. Xem bang cap cua nhan vien");
			System.out.println("6. Exit");
			System.out.println("-----------------------------");

			String click = sc.next();
			switch (click) {
			case "1":
				inputEmployer(list, sc);
				break;
			case "2":
				if (!isEmpty(list)) {
					fixEmployer(list, sc);
				} else {
					System.out.println("Danh sach nhan vien trong!");
				}
				break;
			case "3":
				if (!isEmpty(list)) {
					sortType(list, sc);
				} else {
					System.out.println("Danh sach nhan vien trong!");
				}
				break;
			case "4":
				if (!isEmpty(list)) {
					printEmployer(list);
				} else {
					System.out.println("Danh sach nhan vien trong!");
				}
				break;
			case "5":
				if (!isEmpty(list)) {
					System.out.print("Nhap id nhan vien: ");
					String id_empl = sc.next();
					showCer(list, id_empl);
				} else {
					System.out.println("Danh sach nhan vien trong!");
				}
				break;
			case "6":
				bool = 2;
				break;
			default:
				System.out.println("Lua chon ko hop le");
			}
		}
	}

}
