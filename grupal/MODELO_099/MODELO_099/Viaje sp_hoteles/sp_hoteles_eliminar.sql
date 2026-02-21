-- Eliminar un hotel
DELIMITER $$
CREATE PROCEDURE sp_hotel_eliminar (
    IN idHotel INT
)
BEGIN
    DELETE FROM Hoteles
    WHERE CodigoHotel = idHotel;
END