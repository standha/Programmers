--SELF JOIN
--SELF JOIN으로 자신의 테이블 두개를 ID기준으로 조인함
--하나의 테이블에서는 우유를 다른 하나의 테이블에서는 요거트가 존재하는 ID를 꺼냄
--WHERE절에서 AND로 묶어서 둘 다 존재하는 ID출력하면 중복되어서 나오니(테이블이 2개고 각각 우유 존재한 ID와 요거트 존재하는 ID 출력)
--DISTINCT로 중복 제거 하고 하나의 ID만 나오게
SELECT DISTINCT C.CART_ID
FROM CART_PRODUCTS C, CART_PRODUCTS T
WHERE C.CART_ID = T.CART_ID
AND C.NAME = 'Milk' AND T.NAME = 'Yogurt'
ORDER BY C.CART_ID;


