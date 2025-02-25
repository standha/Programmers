-- 코드를 작성해주세요
SELECT COUNT(ID) AS FISH_COUNT
FROM FISH_INFO 
-- MY_SQL에서 날짜 포멧 조건문 작성 시 YEAR(컬럼) = '조건'
WHERE YEAR(TIME) = '2021';

