CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_hoteles_actualizar`(
	IN dato1 VARCHAR(100),  -- nombre
	IN dato2 VARCHAR(100),  -- direccion
	IN dato3 VARCHAR(60),   -- ciudad
	IN dato4 INT,           -- estrellas
	IN dato5 VARCHAR(20),   -- telefono
	IN dato6 INT            -- id del hotel
)
BEGIN
	UPDATE hoteles
	SET nombre = dato1,
		direccion = dato2,
		ciudad = dato3,
		estrellas = dato4,
		telefono = dato5
	WHERE id_hotel = dato6;
END