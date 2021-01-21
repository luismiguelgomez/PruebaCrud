DROP TABLE IF EXITS cliente;

create table cliente(
	id int auto_increment,
	nombre varchar(250),
	apellido varchar(250),
	tipoDocumento varchar(250),
	cedula integer,
	fechaNacimiento date,
	direccion varchar(100),
	celular integer
);

insert into cliente(nombre, apellido, tipoDocumento, cedula, fechaNacimiento, direccion, celular)
values 
('Carlos', 'Mango', 'CC', 555666, '2000-01-01', 'Avenida primera de mayo', 31022526659),
('ANGEL', 'GAVIRIA', 'CC', 11111, '2005-01-01', 'AV CALI', 3333),
('MIGUEL', 'PAEZ', 'CC', 22222, '1999-01-01', 'AV 30', 23565),
('MARIA', 'BURGOS', 'CC', 33333, '1989-01-01', 'AV 31-8996', 5544441);
