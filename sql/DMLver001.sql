INSERT INTO dept (dept_id, emp_id, name, place, tel, fax, remark) VALUES (1000, 2000, '管理部', '上海黄浦', '64270000', '64270001', '上海黄浦管理部');
INSERT INTO dept (dept_id, emp_id, name, place, tel, fax, remark) VALUES (1001, 2001, '采购部', '上海杨浦', '64271234', '64271235', '无');
INSERT INTO dept (dept_id, emp_id, name, place, tel, fax, remark) VALUES (1002, 2002, '销售部', '上海静安', '61001234', '61001235', '销售部');
INSERT INTO dept (dept_id, emp_id, name, place, tel, fax, remark) VALUES (1003, 2003, '库管部', '上海宝山', '51231234', '51231235', '库管部注释');

INSERT INTO emp_type ( name, remark) VALUES ('经理', '经理');
INSERT INTO emp_type ( name, remark) VALUES ('员工', '员工');

INSERT INTO emp (emp_id, dept_id, manage_type_id, name, emp_no, tel, user_name, password, sex, birthday, degree)
VALUES (2000, 1000, 1, '管理员', '2000', '13800000000', 'admin', 'admin', 'M', '1979-12-30 00:00:00', '大本');
INSERT INTO emp (emp_id, dept_id, manage_type_id, name, emp_no, tel, user_name, password, sex, birthday, degree)
VALUES (2001, 1001, 1, '张三', '2001', '13800123456', 'zhangsan', 'zhangsan', 'M', '1982-03-12 00:00:00', '大本');
INSERT INTO emp (emp_id, dept_id, manage_type_id, name, emp_no, tel, user_name, password, sex, birthday, degree)
VALUES (2002, 1002, 1, '王五', '2002', '13412345678', 'wangwu', 'wangwu', 'F', '1994-02-14 00:00:00', '大专');
INSERT INTO emp (emp_id, dept_id, manage_type_id, name, emp_no, tel, user_name, password, sex, birthday, degree)
VALUES ( 2003, 1001, 2, '李四','2003',  '13812345678', 'lisi', 'lisi', 'F', '1990-01-23 00:00:00', '研究生');
INSERT INTO emp (emp_id, dept_id, manage_type_id, name, emp_no, tel, user_name, password, sex, birthday, degree)
VALUES ( 2004, 1003, 1, '库管员', '2004', '13112345678', 'kgy', 'kgy', 'M', '1988-08-28 00:00:00', '中专');

INSERT INTO customer_type (name, discount_rate, remark) VALUES ('普通', 1, '普通顾客');
INSERT INTO customer_type ( name, discount_rate, remark) VALUES ('银牌客户', 0.95, '银牌客户九五折');
INSERT INTO customer_type ( name, discount_rate, remark) VALUES ('金牌客户', 0.8, '金牌客户八折');

INSERT INTO customer (name, customer_type_id, tel, sex, address, remark) VALUES ('李逍遥', 3, '1234', 'F', '上海杨浦', '上海杨浦1234');
INSERT INTO customer (name, customer_type_id, tel, sex, address, remark) VALUES ('赵灵儿', 1, '1234', 'F', '上海宝山', '上海宝山1234');
INSERT INTO customer (name, customer_type_id, tel, sex, address, remark) VALUES ('林月如', 2, '1234', 'M', '上海静安', '林月如111');