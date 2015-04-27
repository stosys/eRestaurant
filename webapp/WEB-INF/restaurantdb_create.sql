-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2015-04-27 09:04:13.613




-- tables
-- Table: Bills
CREATE TABLE Bills (
    idbill int  NOT NULL,
    date date  NOT NULL,
    payment decimal(10,2)  NOT NULL,
    points int  NOT NULL,
    payed int  NOT NULL,
    Orders_idorder int  NOT NULL,
    CONSTRAINT Bills_pk PRIMARY KEY (idbill)
);



-- Table: Drink_o
CREATE TABLE Drink_o (
    Orders_idorder int  NOT NULL,
    Drinks_iddrink int  NOT NULL,
    iddo int  NOT NULL,
    quantity int  NOT NULL,
    CONSTRAINT Drink_o_pk PRIMARY KEY (iddo)
);



-- Table: Drinks
CREATE TABLE Drinks (
    iddrink int  NOT NULL,
    name varchar(45)  NOT NULL,
    price decimal(5,2)  NOT NULL,
    alc int  NOT NULL,
    hot int  NOT NULL,
    quantity int  NOT NULL,
    CONSTRAINT Drinks_pk PRIMARY KEY (iddrink)
);



-- Table: Food_o
CREATE TABLE Food_o (
    Orders_idorder int  NOT NULL,
    Foods_idfood int  NOT NULL,
    idfo int  NOT NULL,
    quantity int  NOT NULL,
    CONSTRAINT Food_o_pk PRIMARY KEY (idfo)
);



-- Table: Foods
CREATE TABLE Foods (
    idfood int  NOT NULL,
    name varchar(50)  NOT NULL,
    price decimal(5,2)  NOT NULL,
    quantity int  NOT NULL,
    type varchar(20)  NOT NULL,
    CONSTRAINT Foods_pk PRIMARY KEY (idfood)
);



-- Table: Ingredients_d
CREATE TABLE Ingredients_d (
    idingredient int  NOT NULL,
    Drinks_iddrink int  NOT NULL,
    CONSTRAINT Ingredients_d_pk PRIMARY KEY (idingredient)
);



-- Table: Ingredients_f
CREATE TABLE Ingredients_f (
    Foods_idfood int  NOT NULL,
    idingredient int  NOT NULL,
    CONSTRAINT Ingredients_f_pk PRIMARY KEY (idingredient)
);



-- Table: Orders
CREATE TABLE Orders (
    idorder int  NOT NULL,
    type int  NOT NULL,
    address varchar(150)  NULL,
    "table" int  NULL,
    Users_iduser int  NOT NULL,
    CONSTRAINT Orders_pk PRIMARY KEY (idorder)
);



-- Table: Users
CREATE TABLE Users (
    iduser int  NOT NULL,
    type int  NOT NULL,
    phone varchar(10)  NOT NULL,
    email varchar(50)  NOT NULL,
    CONSTRAINT Users_pk PRIMARY KEY (iduser)
);







-- foreign keys
-- Reference:  Bills_Orders (table: Bills)


ALTER TABLE Bills ADD CONSTRAINT Bills_Orders 
    FOREIGN KEY (Orders_idorder)
    REFERENCES Orders (idorder)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Ingredients_Drinks (table: Ingredients_d)


ALTER TABLE Ingredients_d ADD CONSTRAINT Ingredients_Drinks 
    FOREIGN KEY (Drinks_iddrink)
    REFERENCES Drinks (iddrink)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Ingredients_f_Foods (table: Ingredients_f)


ALTER TABLE Ingredients_f ADD CONSTRAINT Ingredients_f_Foods 
    FOREIGN KEY (Foods_idfood)
    REFERENCES Foods (idfood)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Orders_Users (table: Orders)


ALTER TABLE Orders ADD CONSTRAINT Orders_Users 
    FOREIGN KEY (Users_iduser)
    REFERENCES Users (iduser)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Table_8_Drinks (table: Drink_o)


ALTER TABLE Drink_o ADD CONSTRAINT Table_8_Drinks 
    FOREIGN KEY (Drinks_iddrink)
    REFERENCES Drinks (iddrink)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Table_8_Orders (table: Drink_o)


ALTER TABLE Drink_o ADD CONSTRAINT Table_8_Orders 
    FOREIGN KEY (Orders_idorder)
    REFERENCES Orders (idorder)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Table_9_Foods (table: Food_o)


ALTER TABLE Food_o ADD CONSTRAINT Table_9_Foods 
    FOREIGN KEY (Foods_idfood)
    REFERENCES Foods (idfood)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Table_9_Orders (table: Food_o)


ALTER TABLE Food_o ADD CONSTRAINT Table_9_Orders 
    FOREIGN KEY (Orders_idorder)
    REFERENCES Orders (idorder)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;






-- End of file.

