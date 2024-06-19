-- 코드를 입력하세요
SELECT *
FROM FOOD_PRODUCT 
-- 가격이 제일 비싼 식품것을 출력해야함 IN(~~) 사용
WHERE PRICE IN (SELECT MAX(PRICE) FROM FOOD_PRODUCT);