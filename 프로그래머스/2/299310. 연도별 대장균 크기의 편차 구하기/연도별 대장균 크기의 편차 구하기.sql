-- 코드를 작성해주세요
SELECT YEAR(A.DIFFERENTIATION_DATE) AS YEAR, (B.MAX_SIZE - A.SIZE_OF_COLONY) AS YEAR_DEV , A.ID
FROM ECOLI_DATA A
    JOIN (
        SELECT YEAR(A.DIFFERENTIATION_DATE) AS YEAR
                , MAX(A.SIZE_OF_COLONY) AS MAX_SIZE
        FROM ECOLI_DATA A
        GROUP BY  YEAR(A.DIFFERENTIATION_DATE)
    )B
    ON YEAR(DIFFERENTIATION_DATE) = B.YEAR
 ORDER BY YEAR ASC , YEAR_DEV ASC