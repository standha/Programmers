-- 코드를 입력하세요
SELECT ANIMAL_TYPE, COUNT(ANIMAL_TYPE) count
FROM ANIMAL_INS
-- 고양이와 개가 몇마리인지 알아야함(IN() 사용)
WHERE ANIMAL_TYPE IN ('Cat','Dog')
GROUP BY ANIMAL_TYPE
-- 고양이를 개보다 먼저 조회하기 위해 ORDER BY 
ORDER BY ANIMAL_TYPE;
