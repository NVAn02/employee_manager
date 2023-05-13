# employee_manager

# Phần mềm quản lý nhân viên của công ty được mô tả nghiệp vụ như sau:
Mỗi nhân viên (Employee) được công ty chia thành 3 loại sau: Nhân viên có kinh nghiệm lâu năm (Experienced), nhân viên mới ra trường (Fresher) , Nhân viên thực tập (Intern).

Tất cả các Employee đều có các thuộc tính: : id, fullName, birthDay, phone, email, employeeType, employeeCount và phương thức là showInfo để hiển thị thông tin của nhân viên đó (hiển thị thông tin nhân viên ra màn hình console).
Trong đó :
-	employeeType có giá trị tương ứng là 0: Experienced, 1: Fresher, 2: Intern  (tùy vào người dùng nhập vào ứng viên loại nào)
-	employeeCount  dùng để người dùng đếm số lượng nhân viên trong một đợt người dùng nhập nhân viên mới  vào cơ sở dữ liệu. (mỗi lần người dùng nhập thêm mới nhân viên thì thuộc tính employeeCount của class Employee sẽ tăng lên 1)
Ngoài ra:
-	Đối với nhân viên Experience có thêm thuộc tính: Số năm kinh nghiệm (ExpInYear), Kỹ năng chuyên môn (ProSkill)
-	Đối với nhân viênn Fresher có thêm thuộc tính: Thời gian tốt nghiệp(Graduation_date), Xếp loại tốt nghiệp (Graduation_rank) , Trường tốt nghiệp (Education)
-	Đối với nhân viên Intern có thêm thuộc tính: Chuyên ngành đang học (Majors), Học kì đang học (Semester), Tên trường đang học (University_name)
Lưu ý: 
-	Tùy mỗi loại nhân viên, phương thức showMe sẽ được bổ sung thêm các thuộc tính của riêng loại nhân viên đó.
-	Mỗi nhân viên khi vào làm cần phải nộp bằng cấp nghề nghiệp đi kèm, bộ phận tuyển dụng cần quản lý các bằng cấp này. Một nhân viên có thể có nhiều bằng cấp (Certificate). Với mỗi bằng cấp có các thông tin bao gồm: certificatedID, certificateName, certificateRank, certificatedDate.


