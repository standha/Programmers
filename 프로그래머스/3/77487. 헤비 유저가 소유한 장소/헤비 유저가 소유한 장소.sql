-- 코드를 입력하세요
--WHERE A IN (서브쿼리) -> (A)순서쌍이(A에 한개 이상의 값이 들어갈 수 있음) (서브쿼리 결과)와 같은 정보
--서브쿼리가 반환한 결과 중 일치하는 결과가 선택됨(서브 쿼리의 SELECT절은 WHERE에 적은 컬럼명과 같아야함 개수도)
SELECT ID, NAME, HOST_ID
FROM PLACES 
WHERE HOST_ID IN (
    SELECT HOST_ID
    FROM PLACES
    GROUP BY HOST_ID
    HAVING COUNT(HOST_ID) >=2
)
ORDER BY ID;
