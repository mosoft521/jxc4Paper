-- 初始化数据
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
VALUES ( 2004, 1003, 1, '钱小明', '2004', '13112345678', 'kgy', 'kgy', 'M', '1988-08-28 00:00:00', '中专');

INSERT INTO provider (provider_id, name, linkman, tel, address, zip, fax, remark) VALUES (3000, '老庙黄金', '李三', '18410345678', '上海卢湾', '200032', '63451234', '老庙');
INSERT INTO provider (provider_id, name, linkman, tel, address, zip, fax, remark) VALUES (3001, '艾玛通讯', '赵六', '18612345678', '上海徐汇', '200060', '64761234', '艾玛');

INSERT INTO warehouse (warehouse_id, warehouse_name, warehouse_address, tel, warehouse_size) VALUES (5000, '上海仓', '上海市普陀区', '62001234', 1000);
INSERT INTO warehouse (warehouse_id, warehouse_name, warehouse_address, tel, warehouse_size) VALUES (5001, '浦东仓', '浦东外高桥', '56781234', 10000);
INSERT INTO warehouse (warehouse_id, warehouse_name, warehouse_address, tel, warehouse_size) VALUES (5002, '杨行仓', '宝山区杨行镇', '41236789', 5000);

-- INSERT INTO product (product_id, product_name, warehouse_id, provider_id, price, uom, spec, remark) VALUES (4000, '10g项链', 5000, 3000, 4000, '件', '黄金,10g', '10g项链');
-- INSERT INTO product (product_id, product_name, warehouse_id, provider_id, price, uom, spec, remark) VALUES (4001, 'Apple手机', 5001, 3001, 5000, '台', '粉红色,64G', '苹果手机');
-- INSERT INTO product (product_id, product_name, warehouse_id, provider_id, price, uom, spec, remark) VALUES (4002, 'Oppo手机', 5001, 3001, 2000, '台', '32G,红色', 'Oppo手机');

INSERT INTO product (product_id, product_name, price, uom, spec, remark) VALUES (4000, '10g项链', 5000, '件', '黄金,10g', '10g项链');
INSERT INTO product (product_id, product_name, price, uom, spec, remark) VALUES (4001, 'Apple手机', 5001, '台', '粉红色,64G', '苹果手机');
INSERT INTO product (product_id, product_name, price, uom, spec, remark) VALUES (4002, 'Oppo手机', 5001, '台', '32G,红色', 'Oppo手机');

INSERT INTO customer_type (customer_type_id, name, discount_rate, remark) VALUES (9001, '普通', 1, '普通顾客');
INSERT INTO customer_type (customer_type_id, name, discount_rate, remark) VALUES (9002, '银牌客户', 0.95, '银牌客户九五折');
INSERT INTO customer_type (customer_type_id, name, discount_rate, remark) VALUES (9003, '金牌客户', 0.8, '金牌客户八折');

INSERT INTO customer (customer_id, name, customer_type_id, tel, sex, address, remark) VALUES (8000, '测试客户', 9001, '15012345678', 'M', '上海', '上海1234');
INSERT INTO customer (customer_id, name, customer_type_id, tel, sex, address, remark) VALUES (8001, '李逍遥', 9003, '13012345678', 'M', '上海杨浦', '上海杨浦1234');
INSERT INTO customer (customer_id, name, customer_type_id, tel, sex, address, remark) VALUES (8002, '赵灵儿', 9001, '13112345678', 'F', '上海宝山', '上海宝山1234');
INSERT INTO customer (customer_id, name, customer_type_id, tel, sex, address, remark) VALUES (8003, '林月如', 9002, '13212345678', 'F', '上海静安', '林月如123');

-- 采购、销售相关
INSERT INTO purchase (purchase_id, provider_id, emp_id, purchase_no, day, remark) VALUES (1, 3000, 2001, 'CG202005130001', '2020-05-13 06:59:05', '首单测试');
INSERT INTO purchase (purchase_id, provider_id, emp_id, purchase_no, day, remark) VALUES (6001, 3001, 2001, 'CG202005080001', '2020-05-08 10:59:05', '首单');

INSERT INTO purchase_item (purchase_item_id, purchase_id, product_id, price, quantity, remark) VALUES (1, 1, 4000, 4500, 10, '首单采购');
INSERT INTO purchase_item (purchase_item_id, purchase_id, product_id, price, quantity, remark) VALUES (7001, 6001, 4001, 5000, 10, '明细1');
INSERT INTO purchase_item (purchase_item_id, purchase_id, product_id, price, quantity, remark) VALUES (7002, 6001, 4002, 2000, 10, '明细2');

INSERT INTO purchase_stock_in (purchase_stock_in_id, purchase_id, emp_id, purchase_stock_in_no, day, remark) VALUES (1, 1, 2004, 'CGRK202005140001', '2020-05-14 06:59:05', '首单采购入库Test');
INSERT INTO purchase_stock_in (purchase_stock_in_id, purchase_id, emp_id, purchase_stock_in_no, day, remark) VALUES (2, 6001, 2004, 'CGRK202005140002', '2020-05-14 06:59:15', '首单采购入库测试');

INSERT INTO purchase_stock_in_item (purchase_stock_in_item_id, purchase_stock_in_id, product_id, quantity, remark) VALUES (1, 1, 4000, 10, '首单采购入库明细Test');
INSERT INTO purchase_stock_in_item (purchase_stock_in_item_id, purchase_stock_in_id, product_id, quantity, remark) VALUES (2, 2, 4001, 8, '首单采购入库明细测试');
INSERT INTO purchase_stock_in_item (purchase_stock_in_item_id, purchase_stock_in_id, product_id, quantity, remark) VALUES (3, 2, 4002, 10, '首单采购入库明细测试');

INSERT INTO sale (sale_id, emp_id, customer_id, sale_no, day, remark) VALUES (1, 2002, 8000, 'XS202005130001', '2020-05-13 07:17:56', '首单测试');
INSERT INTO sale (sale_id, emp_id, customer_id, sale_no, day, remark) VALUES (9001, 2002, 8001, 'XS202005080001', '2020-05-08 17:17:56', '首单测试Test');

INSERT INTO sale_item (sale_item_id, sale_id, product_id, price, quantity, remark) VALUES (1, 1, 4000, 5000, 1, '10g项链测试单');
INSERT INTO sale_item (sale_item_id, sale_id, product_id, price, quantity, remark) VALUES (10001, 9001, 4001, 8000, 5, 'Apple手机5台');
INSERT INTO sale_item (sale_item_id, sale_id, product_id, price, quantity, remark) VALUES (10002, 9001, 4002, 4000, 10, 'Oppo手机10台');

INSERT INTO sale_stock_out (sale_stock_out_id, sale_id, emp_id, sale_stock_out_no, day, remark) VALUES (1, 1, 2004, 'XSCK202005140000', '2020-05-14 08:25:31', '首单测试');
INSERT INTO sale_stock_out (sale_stock_out_id, sale_id, emp_id, sale_stock_out_no, day, remark) VALUES (1001, 9001, 2004, 'XSCK202005140001', '2020-05-14 18:25:31', '首单测试Test');

INSERT INTO sale_stock_out_item (sale_stock_out_item_id, sale_stock_out_id, product_id, quantity, remark) VALUES (1, 1, 4000, 2, '首单销售出库明细');
INSERT INTO sale_stock_out_item (sale_stock_out_item_id, sale_stock_out_id, product_id, quantity, remark) VALUES (11001, 1001, 4001, 3, '首单销售出库明细init01');
INSERT INTO sale_stock_out_item (sale_stock_out_item_id, sale_stock_out_id, product_id, quantity, remark) VALUES (11002, 1001, 4002, 5, '首单销售出库明细init02');

-- INSERT INTO product (product_id, product_name, warehouse_id, provider_id, price, uom, spec, remark) VALUES (4000, '10g项链', 5000, 3000, 4000, '件', '黄金,10g', '10g项链');
-- INSERT INTO product (product_id, product_name, warehouse_id, provider_id, price, uom, spec, remark) VALUES (4001, 'Apple手机', 5001, 3001, 5000, '台', '粉红色,64G', '苹果手机');
-- INSERT INTO product (product_id, product_name, warehouse_id, provider_id, price, uom, spec, remark) VALUES (4002, 'Oppo手机', 5001, 3001, 2000, '台', '32G,红色', 'Oppo手机');

-- INSERT INTO stock (product_id, quantity_current, quantity_min, quantity_max) VALUES (4000, 8, 10, 10000);
-- INSERT INTO stock (product_id, quantity_current, quantity_min, quantity_max) VALUES (4001, 5, 5, 10000);
-- INSERT INTO stock (product_id, quantity_current, quantity_min, quantity_max) VALUES (4002, 5, 10, 10000);

INSERT INTO stock (product_id, warehouse_id, quantity_current, quantity_min) VALUES (4000, 5000, 8, 10);
INSERT INTO stock (product_id, warehouse_id, quantity_current, quantity_min) VALUES (4001, 5001, 5, 5);
INSERT INTO stock (product_id, warehouse_id, quantity_current, quantity_min) VALUES (4002, 5001, 5, 10);

INSERT INTO supply (product_id, provider_id, price, remark) VALUES (4000, 3000, 4000, '10g项链 精品');
INSERT INTO supply (product_id, provider_id, price, remark) VALUES (4001, 3001, 5000, '苹果手机 精品');
INSERT INTO supply (product_id, provider_id, price, remark) VALUES (4002, 3001, 2000, 'Oppo手机 特价');

INSERT INTO supplement (supplement_id, supplement_no, product_id, quantity, day, remark) VALUES (1, 'BH202005150000', 4000, 1, '2020-05-14 06:59:15', '补货首单');
INSERT INTO supplement (supplement_id, supplement_no, product_id, quantity, day, remark) VALUES (12001, 'BH202005150000', 4001, 3, '2020-05-14 06:59:15', '补货二单');
