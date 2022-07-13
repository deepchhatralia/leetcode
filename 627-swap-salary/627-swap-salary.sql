# update Salary
# set sex = if(sex='m','f','m')

update Salary
set sex = CASE sex
            WHEN 'm' THEN 'f'
            ELSE 'm'
        END