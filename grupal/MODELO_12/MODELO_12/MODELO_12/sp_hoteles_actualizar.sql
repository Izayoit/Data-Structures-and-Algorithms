CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_hotel_actualizar`(
    IN nombre VARCHAR(45),
    IN direccion VARCHAR(45),
    IN ciudad VARCHAR(45),
    IN telefono VARCHAR(10),
    IN plazas INT,
    IN idHotel INT
)
BEGIN
    UPDATE Hoteles
    SET NombreHotel = nombre,
        DireccionHotel = direccion,
        CiudadHotel = ciudad,
        TelefonoHotel = telefono,
        PlazasHotel = plazas
    WHERE CodigoHotel = idHotel;
END