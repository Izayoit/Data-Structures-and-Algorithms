CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_estancias_eliminar`(
    IN dato1 INT
)
BEGIN
    UPDATE estancias
   SET eliminado = 1
	WHERE CodigoEstancia = dato1;
END