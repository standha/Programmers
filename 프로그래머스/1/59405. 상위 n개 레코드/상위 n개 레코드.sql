-- MYSQL
-- SELECT NAME
-- FROM ANIMAL_INS
-- ORDER BY DATETIME ASC
-- LIMIT 1; -- MySQL의 경우 :  LIMIT 구문을 사용


-- Oracle의 경우 인라인 뷰를 활용해 rownum 으로 조회
SELECT NAME
FROM (
    SELECT NAME
    FROM ANIMAL_INS
    ORDER BY DATETIME
    )
    
-- ORACLE의 경우 : rownum 을 활용하여 가장 첫 번째 행의 데이터를 가져옴
WHERE ROWNUM = 1; 

