create database bdweb
go

use bdweb
go


drop table usuarioweb
go

create table usuarioweb
(
	codusu int primary key identity(1,1),
	nomusu varchar(50),
	passusu varbinary(max),
	estusu char(1)
)
go

alter table usuarioweb
add unique (nomusu);
go

/*alter table usuarioweb
drop constraint UQ__usuariow__7A76B76B8EF9CCA2;*/

select * from usuarioweb
go

delete from usuarioweb

insert into usuarioweb (nomusu, passusu, estusu)
values ('abc', pwdencrypt('123456'), 'A')

DBCC CHECKIDENT ('usuarioweb', RESEED, 0)


----------PROCEDIMIENTOS ALMACENADOS


CREATE proc usp_crear_usuario
@nomusu varchar(50),
@passusu varchar(50)
as
begin

	if exists(select 1 
		from usuarioweb where nomusu = @nomusu) begin
		--print 'El usuario ya existe no puede volver a 
		--	   utilizar el nombre ' + @nomusu
		RAISERROR ('El usuario ya existe', 16, 1)
	end else begin
		insert into usuarioweb
			(nomusu, passusu, estusu)
		values
			(@nomusu, PWDENCRYPT(@passusu), 'A' )
	end
end
