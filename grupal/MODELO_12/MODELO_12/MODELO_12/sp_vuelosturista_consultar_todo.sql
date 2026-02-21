CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_vuelosturista_consultar_todos`()
BEGIN
    SELECT * FROM VuelosTurista
    WHERE eliminado = 0;
END