WITH RECURSIVE ECOLI_GEN AS (
    -- 1. Base Case: 부모가 없는 1세대 대장균 추출
    SELECT 
        ID, 
        PARENT_ID, 
        1 AS GENERATION
    FROM 
        ECOLI_DATA
    WHERE 
        PARENT_ID IS NULL
    
    UNION ALL
    
    -- 2. Recursive Step: 부모 ID와 조인하여 다음 세대 계산
    SELECT 
        E.ID, 
        E.PARENT_ID, 
        G.GENERATION + 1
    FROM 
        ECOLI_DATA E
    JOIN 
        ECOLI_GEN G ON E.PARENT_ID = G.ID
)
-- 3. 자식이 없는 대장균만 필터링하여 세대별 집계
SELECT 
    COUNT(ID) AS COUNT, 
    GENERATION
FROM 
    ECOLI_GEN
WHERE 
    ID NOT IN (
        SELECT PARENT_ID 
        FROM ECOLI_DATA 
        WHERE PARENT_ID IS NOT NULL
    )
GROUP BY 
    GENERATION
ORDER BY 
    GENERATION ASC;