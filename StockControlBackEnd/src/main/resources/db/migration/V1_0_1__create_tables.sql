CREATE TABLE employee (
  id BINARY(16) NOT NULL,
  employee_name VARCHAR(45) NULL,
  password  VARCHAR(45) NULL,
  PRIMARY KEY (id));
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);
  
CREATE TABLE product (
  id BINARY(16) NOT NULL,
  product_name VARCHAR(45) NOT NULL,
  unit_in_stock int NOT NULL,
  unit_price double NOT NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);
  
  CREATE TABLE role (
  id BINARY(16) NOT NULL,
  role VARCHAR(45) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX role_unq (role ASC) VISIBLE);
  
  
  CREATE TABLE employee_role (
  employee_id BINARY(16) NOT NULL,
  role_id BINARY(16) NOT NULL,
  PRIMARY KEY (employee_id, role_id),
  INDEX emp_role_role_fk_idx (role_id ASC) VISIBLE,
  CONSTRAINT emp_role_emp_fk
    FOREIGN KEY (employee_id)
    REFERENCES employee (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT emp_role_role_fk
    FOREIGN KEY (role_id)
    REFERENCES roles (id));

  