import pandas as pd

def modifySalaryColumn(employees: pd.DataFrame) -> pd.DataFrame:
    """
    def modifySalaryColumn(employees: pd.DataFrame) -> pd.DataFrame:

def: Esta palabra clave indica el comienzo de la definición de una función en Python.

modifySalaryColumn: Este es el nombre de la función. Es una buena práctica elegir nombres que indiquen claramente lo que hace la función (en este caso, modifica una columna de salario).

(employees: pd.DataFrame): Esto define el parámetro de entrada para la función.

employees: Este es el nombre del parámetro. Cuando llames a esta función, le pasarás un DataFrame, y dentro de la función, ese DataFrame se referirá como employees.

: pd.DataFrame: Esto es una pista de tipo (type hint). Le indica a ti (y a otros desarrolladores, así como a algunas herramientas de desarrollo) que se espera que el parámetro employees sea un DataFrame de Pandas. No impone estrictamente el tipo en tiempo de ejecución, pero es muy útil para la legibilidad y para detectar posibles errores.
    """
    employees['salary'] = employees['salary'].transform(func = lambda x: x*2)
    return employees

"""
lambda x: x*2: Esta es una función anónima (una función lambda).

lambda: Palabra clave para definir una función pequeña y anónima.

x: Esto representa cada valor individual en la columna 'salary' a medida que el método transform itera a través de ella.

x*2: Esta es la operación que se realiza. Multiplica cada valor de salario (x) por 2.

"""