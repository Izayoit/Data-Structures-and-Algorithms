CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_hoteles_insertar`(
	IN dato1 VARCHAR(100),  -- nombre
	IN dato2 VARCHAR(100),  -- direccion
	IN dato3 VARCHAR(60),   -- ciudad
	IN dato4 Varchar(60),           -- estrellas
	IN dato5 VARCHAR(20),   -- telefono
	OUT dato6 INT           -- id generado
)
BEGIN
	INSERT INTO hoteles(NombreHotel, DireccionHotel, CiudadHotel, telefonoHotel, PlazasHotel)
	VALUES(dato1, dato2, dato3, dato4, dato5);
	
	SET dato6 = LAST_INSERT_ID();
END