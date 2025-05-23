-- 코드를 입력하세요
SELECT A.PRODUCT_CODE, SUM(A.PRICE * A.SALES_AMOUNT) AS SALES
FROM(
    SELECT A.PRODUCT_CODE, A.PRICE, B.SALES_AMOUNT
    
    FROM PRODUCT    A
    INNER JOIN OFFLINE_SALE     B
    ON A.PRODUCT_ID = B.PRODUCT_ID
    )A
    
GROUP BY A.PRODUCT_CODE
-- 우선 매출액 기준으로 내림차순 후 매출액이 같으면 상품코드를 기준으로 오름차순 정렬
ORDER BY SALES DESC, A.PRODUCT_CODE ASC;