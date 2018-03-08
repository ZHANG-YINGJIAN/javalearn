CREATE PROCEDURE pro_getStuNameById(IN stuid INT, OUT bN VARCHAR(20))
  BEGIN 
   SELECT name INTO bn FROM student WHERE student.id=stuid;
 END;

