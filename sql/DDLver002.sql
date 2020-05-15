drop table if exists customer;

drop table if exists customer_type;

drop table if exists dept;

drop table if exists emp;

drop table if exists emp_type;

drop table if exists product;

drop table if exists provider;

drop table if exists purchase;

drop table if exists purchase_item;

drop table if exists purchase_return;

drop table if exists purchase_return_item;

drop table if exists purchase_return_stock_out;

drop table if exists purchase_return_stock_out_item;

drop table if exists purchase_stock_in;

drop table if exists purchase_stock_in_item;

drop table if exists sale;

drop table if exists sale_item;

drop table if exists sale_return;

drop table if exists sale_return_item;

drop table if exists sale_return_stock_in;

drop table if exists sale_return_stock_in_item;

drop table if exists sale_stock_out;

drop table if exists sale_stock_out_item;

drop table if exists stock;

drop table if exists supplement;

drop table if exists warehouse;

/*==============================================================*/
/* Table: customer                                              */
/*==============================================================*/
create table customer
(
   customer_id          int not null auto_increment comment '客户ID',
   customer_type_id     int not null comment '客户类别ID',
   name                 varchar(10) not null comment '中文名',
   tel                  varchar(11) not null comment '电话',
   sex                  char(1) not null comment '性别',
   address              varchar(50) not null comment '地址',
   remark               varchar(50) comment '备注',
   primary key (customer_id)
);

alter table customer comment '客户';

/*==============================================================*/
/* Table: customer_type                                         */
/*==============================================================*/
create table customer_type
(
   customer_type_id     int not null auto_increment comment '客户类别ID',
   name                 varchar(30) not null comment '类别名称',
   discount_rate        float not null default 1.00 comment '折扣率',
   remark               varchar(50) comment '备注',
   primary key (customer_type_id)
);

alter table customer_type comment '客户类别';

/*==============================================================*/
/* Table: dept                                                  */
/*==============================================================*/
create table dept
(
   dept_id              int not null auto_increment comment '部门ID',
   emp_id               int comment '领导ID',
   name                 varchar(30) not null comment '部门名',
   place                varchar(30) comment '位置',
   tel                  varchar(11) comment '电话',
   fax                  varchar(11) comment 'FAX',
   remark               varchar(50) comment '备注',
   primary key (dept_id)
);

alter table dept comment '部门';

/*==============================================================*/
/* Table: emp                                                   */
/*==============================================================*/
create table emp
(
   emp_id               int not null auto_increment comment '员工ID',
   dept_id              int not null comment '所属部门ID',
   manage_type_id       int not null comment '管理类别ID',
   name                 varchar(10) not null comment '姓名',
   emp_no               varchar(10) not null comment '工号',
   tel                  varchar(11) not null comment '联系电话',
   user_name            varchar(8) not null comment '用户名',
   password             varchar(8) not null comment '密码',
   sex                  char(1) comment '性别',
   birthday             datetime comment '出生年月',
   degree               varchar(8) comment '最高学历',
   primary key (emp_id)
);

alter table emp comment '员工';

/*==============================================================*/
/* Table: emp_type                                              */
/*==============================================================*/
create table emp_type
(
   emp_type_id          int not null auto_increment comment '员工类别ID',
   name                 varchar(30) not null comment '类别名称',
   remark               varchar(50) comment '备注',
   primary key (emp_type_id)
);

alter table emp_type comment '员工类别';

/*==============================================================*/
/* Table: product                                               */
/*==============================================================*/
create table product
(
   product_id           int not null auto_increment comment '商品ID',
   warehouse_id         int not null comment '仓库ID',
   provider_id          int comment '供应商ID',
   product_name         varchar(30) not null comment '商品名',
   price                float not null comment '单价',
   uom                  varchar(10) not null comment '商品计量单位',
   spec                 varchar(10) not null comment '商品规格',
   remark               varchar(50) comment '备注',
   primary key (product_id)
);

alter table product comment '商品';

/*==============================================================*/
/* Table: provider                                              */
/*==============================================================*/
create table provider
(
   provider_id          int not null auto_increment comment '供应商ID',
   name                 varchar(30) not null comment '名称',
   linkman              varchar(8) not null comment '联系人',
   tel                  varchar(11) not null comment '电话',
   address              varchar(50) not null comment '地址',
   zip                  char(6) not null comment '邮编',
   fax                  varchar(15) comment '传真',
   remark               varchar(50) comment '备注',
   primary key (provider_id)
);

alter table provider comment '供应商';

/*==============================================================*/
/* Table: purchase                                              */
/*==============================================================*/
create table purchase
(
   purchase_id          int not null auto_increment comment '采购单ID',
   provider_id          int not null comment '供应商ID',
   emp_id               int not null comment '采购员工ID',
   purchase_no          varchar(32) not null comment '采购单号',
   day                  datetime not null comment '日期',
   remark               varchar(50) comment '备注',
   primary key (purchase_id)
);

alter table purchase comment '采购';

/*==============================================================*/
/* Table: purchase_item                                         */
/*==============================================================*/
create table purchase_item
(
   purchase_item_id     int not null auto_increment comment '采购明细ID',
   purchase_id          int comment '采购单ID',
   product_id           int not null comment '商品ID',
   price                float not null comment '单价',
   quantity             int not null comment '数量',
   remark               varchar(50) comment '备注',
   primary key (purchase_item_id)
);

alter table purchase_item comment '采购明细';

/*==============================================================*/
/* Table: purchase_return                                       */
/*==============================================================*/
create table purchase_return
(
   purchase_return_id   int not null auto_increment comment '采购退货ID',
   purchase_id          int not null comment '采购单id',
   emp_id               int comment '员工ID',
   purchase_return_no   varchar(32) not null comment '入库单号',
   day                  datetime not null comment '日期',
   remark               varchar(50) comment '备注',
   primary key (purchase_return_id)
);

alter table purchase_return comment '采购退货';

/*==============================================================*/
/* Table: purchase_return_item                                  */
/*==============================================================*/
create table purchase_return_item
(
   purchase_return_item_id int not null auto_increment comment '采购退货明细ID',
   purchase_return_id   int comment '采购退货ID',
   product_id           int comment '商品ID',
   quantity             int not null comment '数量',
   remark               varchar(50) comment '备注',
   primary key (purchase_return_item_id)
);

alter table purchase_return_item comment '采购退货明细';

/*==============================================================*/
/* Table: purchase_return_stock_out                             */
/*==============================================================*/
create table purchase_return_stock_out
(
   purchase_return_stock_out_id int not null auto_increment comment '采购退货出库ID',
   purchase_return_id   int comment '采购退货单ID',
   emp_id               int comment '员工ID',
   purchase_return_stock_out_no varchar(32) not null comment '出库单号',
   day                  datetime not null comment '日期',
   remark               varchar(50) comment '备注',
   primary key (purchase_return_stock_out_id)
);

alter table purchase_return_stock_out comment '采购退货出库';

/*==============================================================*/
/* Table: purchase_return_stock_out_item                        */
/*==============================================================*/
create table purchase_return_stock_out_item
(
   purchase_return_stock_out_item_id int not null auto_increment comment '采购退货出库明细ID',
   purchase_return_stock_out_id int comment '采购退货出库ID',
   product_id           int comment '商品ID',
   quantity             int not null comment '数量',
   remark               varchar(50) comment '备注',
   primary key (purchase_return_stock_out_item_id)
);

alter table purchase_return_stock_out_item comment '采购退货出库明细';

/*==============================================================*/
/* Table: purchase_stock_in                                     */
/*==============================================================*/
create table purchase_stock_in
(
   purchase_stock_in_id int not null auto_increment comment '采购入库ID',
   purchase_id          int not null comment '采购单id',
   emp_id               int comment '员工ID',
   purchase_stock_in_no varchar(32) not null comment '入库单号',
   day                  datetime not null comment '日期',
   remark               varchar(50) comment '备注',
   primary key (purchase_stock_in_id)
);

alter table purchase_stock_in comment '采购入库';

/*==============================================================*/
/* Table: purchase_stock_in_item                                */
/*==============================================================*/
create table purchase_stock_in_item
(
   purchase_stock_in_item_id int not null auto_increment comment '采购入库明细ID',
   purchase_stock_in_id int comment '采购入库ID',
   product_id           int comment '商品ID',
   quantity             int not null comment '数量',
   remark               varchar(50) comment '备注',
   primary key (purchase_stock_in_item_id)
);

alter table purchase_stock_in_item comment '采购入库明细';

/*==============================================================*/
/* Table: sale                                                  */
/*==============================================================*/
create table sale
(
   sale_id              int not null auto_increment comment '销售ID',
   emp_id               int not null comment '销售员工ID',
   customer_id          int not null comment '客户ID',
   sale_no              varchar(32) not null comment '销售单号',
   day                  datetime not null comment '日期',
   remark               varchar(50) comment '备注',
   primary key (sale_id)
);

alter table sale comment '销售';

/*==============================================================*/
/* Table: sale_item                                             */
/*==============================================================*/
create table sale_item
(
   sale_item_id         int not null auto_increment comment '销售明细ID',
   sale_id              int comment '销售ID',
   product_id           int not null comment '商品ID',
   price                float not null comment '单价',
   quantity             int not null comment '数量',
   remark               varchar(50) comment '备注',
   primary key (sale_item_id)
);

alter table sale_item comment '销售明细';

/*==============================================================*/
/* Table: sale_return                                           */
/*==============================================================*/
create table sale_return
(
   sale_return_id       int not null auto_increment comment '销售退货ID',
   sale_id              int not null comment '销售单ID',
   emp_id               int comment '员工ID',
   sale_return_no       varchar(32) not null comment '销售退货单号',
   day                  datetime not null comment '日期',
   remark               varchar(50) comment '备注',
   primary key (sale_return_id)
);

alter table sale_return comment '销售退货';

/*==============================================================*/
/* Table: sale_return_item                                      */
/*==============================================================*/
create table sale_return_item
(
   sale_return_item_id  int not null auto_increment comment '销售退货明细ID',
   sale_return_id       int comment '销售退货ID',
   product_id           int comment '商品ID',
   quantity             int not null comment '数量',
   remark               varchar(50) comment '备注',
   primary key (sale_return_item_id)
);

alter table sale_return_item comment '销售退货明细';

/*==============================================================*/
/* Table: sale_return_stock_in                                  */
/*==============================================================*/
create table sale_return_stock_in
(
   sale_return_stock_in_id int not null auto_increment comment '销售退货入库ID',
   sale_return_id       int comment '销售退货单ID',
   emp_id               int comment '员工ID',
   sale_return_stock_in_no varchar(32) not null comment '销售退货入库单号',
   day                  datetime not null comment '日期',
   remark               varchar(50) comment '备注',
   primary key (sale_return_stock_in_id)
);

alter table sale_return_stock_in comment '销售退货入库';

/*==============================================================*/
/* Table: sale_return_stock_in_item                             */
/*==============================================================*/
create table sale_return_stock_in_item
(
   sale_return_stock_in_item_id int not null auto_increment comment '销售退货入库明细ID',
   sale_return_stock_in_id int comment '销售退货入库ID',
   product_id           int comment '商品ID',
   quantity             int not null comment '数量',
   remark               varchar(50) comment '备注',
   primary key (sale_return_stock_in_item_id)
);

alter table sale_return_stock_in_item comment '销售退货入库明细';

/*==============================================================*/
/* Table: sale_stock_out                                        */
/*==============================================================*/
create table sale_stock_out
(
   sale_stock_out_id    int not null auto_increment comment '销售出库ID',
   sale_id              int not null comment '销售单ID',
   emp_id               int comment '员工ID',
   sale_stock_out_no    varchar(32) not null comment '出库单号',
   day                  datetime not null comment '日期',
   remark               varchar(50) comment '备注',
   primary key (sale_stock_out_id)
);

alter table sale_stock_out comment '销售出库';

/*==============================================================*/
/* Table: sale_stock_out_item                                   */
/*==============================================================*/
create table sale_stock_out_item
(
   sale_stock_out_item_id int not null auto_increment comment '销售出库明细ID',
   sale_stock_out_id    int comment '销售出库ID',
   product_id           int comment '商品ID',
   quantity             int not null comment '数量',
   remark               varchar(50) comment '备注',
   primary key (sale_stock_out_item_id)
);

alter table sale_stock_out_item comment '销售出库明细';

/*==============================================================*/
/* Table: stock                                                 */
/*==============================================================*/
create table stock
(
   product_id           int not null comment '商品ID',
   quantity_current     int not null comment '当前库存量',
   quantity_min         int not null comment '最小库存量',
   quantity_max         int not null comment '最大库存量',
   primary key (product_id)
);

alter table stock comment '库存';

/*==============================================================*/
/* Table: supplement                                            */
/*==============================================================*/
create table supplement
(
   supplement_id        int not null auto_increment comment '补货单ID',
   supplement_no        varchar(32) not null comment '补货单号',
   product_id           int comment '商品ID',
   quantity             int not null comment '数量',
   remark               varchar(50) comment '备注',
   primary key (supplement_id)
);

alter table supplement comment '补货';

/*==============================================================*/
/* Table: warehouse                                             */
/*==============================================================*/
create table warehouse
(
   warehouse_id         int not null auto_increment comment '仓库ID',
   warehouse_name       varchar(30) not null comment '仓库名称',
   warehouse_address    varchar(50) not null comment '仓库地址',
   tel                  varchar(11) not null comment '电话',
   warehouse_size       int not null comment '仓库大小',
   primary key (warehouse_id)
);

alter table warehouse comment '仓库';
