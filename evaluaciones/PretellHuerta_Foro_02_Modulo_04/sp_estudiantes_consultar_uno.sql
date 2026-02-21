CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_estudiantes_consultar_uno`(
	OUT dato1 VARCHAR(60), OUT dato2 VARCHAR(60), OUT dato3 VARCHAR(60), OUT dato4 VARCHAR(60), OUT dato5 INT, OUT dato6 INT , IN dato7 INT
)
BEGIN
	SELECT dni, nombres,apellidos ,correo ,telefono,id_carrera
    INTO dato1,dato2,dato3,dato4,dato5,dato6
    FROM estudiantes
    WHERE id_estudiante=dato7;
END