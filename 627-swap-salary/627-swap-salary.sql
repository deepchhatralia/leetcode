update Salary
set sex = CASE sex
            WHEN 'm' then 'f'
            ELSE 'm'
        END