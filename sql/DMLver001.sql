INSERT INTO dept (name, place, tel, fax, remark) VALUES ('管理部', '不知道', '123', '123', '管理部门');
INSERT INTO dept (name, place, tel, fax, remark) VALUES ( '开发部', '开发署', '234', '234', '开发部门');

INSERT INTO emp_type ( name, remark) VALUES ('经理', '经理');
INSERT INTO emp_type ( name, remark) VALUES ('员工', '员工');

INSERT INTO emp (dept_id, manage_type_id, name, emp_no, tel, user_name, password, sex, birthday, degree) VALUES ( 1, 1, '张三', '1001', '123', 'admin', 'admin', 'F', '1979-12-30 00:00:00', '本科');
INSERT INTO emp (dept_id, manage_type_id, name, emp_no, tel, user_name, password, sex, birthday, degree) VALUES ( 2, 2, '李四', '1002', '234', 'user', 'user', 'M', '1990-11-22 00:00:00', '研究生');
INSERT INTO emp (dept_id, manage_type_id, name, emp_no, tel, user_name, password, sex, birthday, degree) VALUES ( 2, 2, '程序猿','1003',  '123', 'cxy', '1234', 'F', '1982-03-12 00:00:00', '大专');
INSERT INTO emp (dept_id, manage_type_id, name, emp_no, tel, user_name, password, sex, birthday, degree) VALUES ( 4, 2, '测试员', '1004', '1234', 'csy', '1234', 'F', '1990-03-12 00:00:00', '不知道');

