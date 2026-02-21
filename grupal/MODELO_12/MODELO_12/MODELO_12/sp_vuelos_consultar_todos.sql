CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_vuelos_consultar_todos`()
BEGIN
	SELECT * FROM vuelos
    WHERE eliminado = 0;
END