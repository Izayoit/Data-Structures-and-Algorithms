CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_hotel_eliminar`(
    IN dato1 INT
)
BEGIN
   UPDATE hoteles
   SET eliminado = 1
	WHERE CodigoHotel = dato1;
END