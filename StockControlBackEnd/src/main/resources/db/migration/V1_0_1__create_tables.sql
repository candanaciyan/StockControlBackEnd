CREATE TABLE employee (
  id BINARY(16) NOT NULL,
  employee_name VARCHAR(20) NULL,
  password  VARCHAR(20) NULL,
  PRIMARY KEY (id));
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);
  
CREATE TABLE product (
  id BINARY(16) NOT NULL,
  product_name VARCHAR(25) NOT NULL,
  unit_in_stock int NOT NULL,
  unit_price double NOT NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);

  