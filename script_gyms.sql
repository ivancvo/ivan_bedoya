drop database if exists gym;

create database gym;

use gym;

create table Tipo_Plan(
Id_Tipo_Plan int primary key auto_increment,
Nombre_Tipo_Plan varchar(50) not null,
Descripcion_Plan varchar(100) not null
);

create table Rutina(
Id_Rutina int primary key auto_increment,
Nombre_Rutina varchar(50) not null,
Descripcion_Rutina varchar(60)
);

create table Objetivo_Entrenamiento(
Id_Objetivo_Entrenamiento int primary key auto_increment,
Nombre_Objetivo varchar(50) not null,
Descripcion_Objetivo varchar(50) not null 
);

create table Medidas_Corporales(
Id_Medidas_Corporales int primary key auto_increment,
Estatura float not null,
Peso float not null,
Medida_Biceps float not null,
Medida_Torso float not null,
Medida_Muslos float not null,
Medida_Gemelos float not null,
Imc float GENERATED ALWAYS AS (((Estatura ^ 2 / Peso ))) STORED
);
-- nueva tabla

create table Usuario(
Id_Usuario int primary key auto_increment,
Cedula_Usu varchar(20),
Email_Usu varchar(50),
Nombres_Usu varchar(100),
Fecha_Inscripcion_Usu date,
Id_Tipo_Plan int not null,
Id_Rutina int not null,
Id_Objetivo_Entrenamiento int not null,
Id_Medidas_Corporales int not null,
foreign key (Id_Tipo_Plan) references Tipo_Plan(Id_Tipo_Plan),
foreign key (Id_Rutina) references Rutina(Id_Rutina),
foreign key (Id_Objetivo_Entrenamiento) references Objetivo_Entrenamiento(Id_Objetivo_Entrenamiento),
foreign key (Id_Medidas_Corporales) references Medidas_Corporales(Id_Medidas_Corporales)
);
