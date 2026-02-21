CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_hoteles_eliminar`(
	IN dato1 INT  -- id del hotel
)
BEGIN
	UPDATE hoteles
	SET eliminado = 1
	WHERE id_hotel = dato1;
END