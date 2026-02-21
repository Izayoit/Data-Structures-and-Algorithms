CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_hoteles_consultar_todos`()
BEGIN
	SELECT *
	FROM hoteles
	WHERE eliminado = 0;
END