import java.util.*

fun main() {
    EjercicioUno(4);
    EjercicioDos();
    EjercicioTres();
    EjercicioCuatro();
    EjercicioCinco();
    EjercicioSeis();
    EjercicioSiete();
    EjercicioOcho();
    EjercicioNueve();
    EjercicioDiez();
    EjercicioOnce();
    EjercicioDoce();
    EjercicioTrece(5);
    EjercicioCatorce();
    EjercicioQuince(5);
    EjercicioDieciseis();
    EjercicioDiecisiete(5);
    EjercicioDieciocho();
    EjercicioDiecinueve(5);
    EjercicioVeinte(5);
}

fun EjercicioUno(numberK: Int) {
    println("Ejercicio 1")
    val matriz = arrayOf(
        arrayOf(1, 2, 3, 4),
        arrayOf(4, 5, 6, 7),
        arrayOf(7, 8, 9, 0)
    )

    val RestMatriz = Array(matriz.size) { IntArray(matriz[0].size) }
    for (i in matriz.indices) {
        for (j in matriz[i].indices) {
            RestMatriz[i][j] = matriz[i][j] * numberK
        }
    }

    println(RestMatriz.contentDeepToString())
}

fun EjercicioDos() {
    println("Ejercicio 2")
    val matrix = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )

    val mainDiagonal = mutableListOf<Int>()
    val secundaryDiagonal = mutableListOf<Int>()
    val triangleTop = mutableListOf<Int>()
    val triangleBottom = mutableListOf<Int>()
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            if (i == j) {
                mainDiagonal.add(matrix[i][j])
            }
            if (i + j == matrix.size - 1) {
                secundaryDiagonal.add(matrix[i][j])
            }
            if (i < j) {
                triangleTop.add(matrix[i][j])
            }
            if (i > j) {
                triangleBottom.add(matrix[i][j])
            }
        }
    }

    println("Diagonal Principal " + mainDiagonal.toString())
    println("Diagonal Secundaria " + secundaryDiagonal.toString())
    println("Triangulo Superior " + triangleTop.toString())
    println("Triangulo Inferior " + triangleBottom.toString())
}

fun EjercicioTres() {
    println("Ejercicio 3")
    val matriz = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )

    val transpuesta = Array(matriz[0].size) { IntArray(matriz.size) }

    for (i in matriz.indices) {
        for (j in matriz[i].indices) {
            transpuesta[j][i] = matriz[i][j]
        }
    }

    println("Matriz Original:")
    matriz.forEach {
        println(it.joinToString(" "))
    }

    println("Matriz Transpuesta:")
    transpuesta.forEach {
        println(it.joinToString(" "))
    }
}

fun EjercicioCuatro() {
    println("Ejercicio 4")
    val  scanner = Scanner(System.`in`)

    var N: Int
    do {
        print("Introduce el número de filas (N): ")
        N = scanner.nextInt()
    } while (N <= 0)

    var M: Int
    do {
        print("Introduce el número de columnas (M): ")
        M = scanner.nextInt()
    } while (M <= 0)

    val matriz = Array(N) { DoubleArray(M) }

    println("Introduce los elementos de la matriz:")
    for (i in 0 until N) {
        for (j in 0 until M) {
            print("Elemento [$i][$j]: ")
            matriz[i][j] = scanner.nextDouble()
        }
    }

    if (N == M) {
        println("La matriz es cuadrada.")
    } else {
        println("La matriz no es cuadrada.")
    }

    var sumaTotal = 0.0
    for (i in 0 until N) {
        for (j in 0 until M) {
            sumaTotal += matriz[i][j]
        }
    }
    val promedioTotal = sumaTotal / (N * M)
    println("El promedio de todos los números es: $promedioTotal")

    println("Promedio por fila:")
    for (i in 0 until N) {
        var sumaFila = 0.0
        for (j in 0 until M) {
            sumaFila += matriz[i][j]
        }
        val promedioFila = sumaFila / M
        println("Fila $i: $promedioFila")
    }

    println("Promedio por columna:")
    for (j in 0 until M) {
        var sumaColumna = 0.0
        for (i in 0 until N) {
            sumaColumna += matriz[i][j]
        }
        val promedioColumna = sumaColumna / N
        println("Columna $j: $promedioColumna")
    }

}

fun EjercicioCinco() {
    println("Ejercicio 5")
    print("Ingrese el número de filas (N):")
    val N = readLine()!!.toInt()
    print("Ingrese el número de columnas (M):")
    val M = readLine()!!.toInt()

    val matrix = Array(N) { IntArray(M) }

    println("Ingrese los elementos de la matriz (0 o 1):")
    for (i in 0 until N) {
        for (j in 0 until M) {
            matrix[i][j] = readLine()!!.toInt()
        }
    }

    val rowCount = IntArray(N)
    val colCount = IntArray(M)

    for (i in 0 until N) {
        for (j in 0 until M) {
            if (matrix[i][j] == 1) {
                rowCount[i]++
                colCount[j]++
            }
        }
    }

    for (i in 0 until N) {
        if (rowCount[i] != 1) {
            println("No es rala")
            return
        }
    }

    for (j in 0 until M) {
        if (colCount[j] != 1) {
            println("No es rala")
            return
        }
    }

    println("Es rala")
}

fun EjercicioSeis() {
    println("Ejercicio 6")
    val scanner = Scanner(System.`in`)

    var N: Int
    do {
        print("Introduce el número de filas (N): ")
        N = scanner.nextInt()
    } while (N <= 0)

    var M: Int
    do {
        print("Introduce el número de columnas (M): ")
        M = scanner.nextInt()
    } while (M <= 0)

    val matriz1 = Array(N) { DoubleArray(M) }
    val matriz2 = Array(N) { DoubleArray(M) }

    println("Introduce los elementos de la primera matriz:")
    for (i in 0 until N) {
        for (j in 0 until M) {
            print("Elemento [$i][$j] de la matriz 1: ")
            matriz1[i][j] = scanner.nextDouble()
        }
    }

    println("Introduce los elementos de la segunda matriz:")
    for (i in 0 until N) {
        for (j in 0 until M) {
            print("Elemento [$i][$j] de la matriz 2: ")
            matriz2[i][j] = scanner.nextDouble()
        }
    }

    val sumaMatrices = Array(N) { DoubleArray(M) }
    for (i in 0 until N) {
        for (j in 0 until M) {
            sumaMatrices[i][j] = matriz1[i][j] + matriz2[i][j]
        }
    }

    println("\nMatriz suma:")
    for (i in 0 until N) {
        for (j in 0 until M) {
            print("${sumaMatrices[i][j]} \t")
        }
        println()
    }

    if (N == M) {
        val productoMatrices = Array(N) { DoubleArray(M) }

        for (i in 0 until N) {
            for (j in 0 until M) {
                var sumaProducto = 0.0
                for (k in 0 until N) { // Multiplicación de filas y columnas
                    sumaProducto += matriz1[i][k] * matriz2[k][j]
                }
                productoMatrices[i][j] = sumaProducto
            }
        }

        println("\nMatriz producto:")
        for (i in 0 until N) {
            for (j in 0 until M) {
                print("${productoMatrices[i][j]} \t")
            }
            println()
        }
    } else {
        println("\nNo es posible multiplicar las matrices porque no son cuadradas (N debe ser igual a M).")
    }

}

fun EjercicioSiete() {
    println("Ejercicio 7")
    print("Ingrese el número de filas (N):")
    val N = readLine()!!.toInt()
    print("Ingrese el número de columnas (M):")
    val M = readLine()!!.toInt()

    val matrix = Array(N) { IntArray(M) }

    println("Ingrese los elementos de la matriz:")
    for (i in 0 until N) {
        for (j in 0 until M) {
            matrix[i][j] = readLine()!!.toInt()
        }
    }

    println("Matriz original:")
    printMatrix(matrix)

    var x: Int
    do {
        println("Ingrese el índice de la fila a eliminar (0 a ${N - 1}):")
        x = readLine()!!.toInt()
    } while (x < 0 || x >= N)

    val newMatrixAfterRow = matrix.filterIndexed { index, _ -> index != x }.toTypedArray()

    val newN = newMatrixAfterRow.size

    var y: Int
    do {
        println("Ingrese el índice de la columna a eliminar (0 a ${M - 1}):")
        y = readLine()!!.toInt()
    } while (y < 0 || y >= M)

    val newMatrixAfterColumn = newMatrixAfterRow.map { row -> row.filterIndexed { index, _ -> index != y }.toIntArray() }.toTypedArray()

    val newM = newMatrixAfterColumn[0].size

    println("Matriz después de eliminar fila $x y columna $y:")
    printMatrix(newMatrixAfterColumn)

    IntArray(newM)
    print("Ingrese los elementos de la nueva fila (separados por espacio):")
    var rowInput = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    while (rowInput.size != newM) {
        println("La nueva fila debe tener $newM elementos. Intente de nuevo:")
        rowInput.fill(0) // Reiniciar el array
        val newRowInput = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
        rowInput = newRowInput
    }

    do {
        print("Ingrese el índice para insertar la nueva fila (0 a $newN):")
        x = readLine()!!.toInt()
    } while (x < 0 || x > newN)

    val finalMatrixAfterRowInsert = Array(newN + 1) { IntArray(newM) }
    for (i in 0 until finalMatrixAfterRowInsert.size) {
        if (i < x) {
            finalMatrixAfterRowInsert[i] = newMatrixAfterColumn[i]
        } else if (i == x) {
            finalMatrixAfterRowInsert[i] = rowInput
        } else {
            finalMatrixAfterRowInsert[i] = newMatrixAfterColumn[i - 1]
        }
    }

    println("Matriz después de insertar la nueva fila en índice $x:")
    printMatrix(finalMatrixAfterRowInsert)

    IntArray(finalMatrixAfterRowInsert.size)
    println("Ingrese los elementos de la nueva columna (separados por espacio):")
    var columnInput = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    while (columnInput.size != finalMatrixAfterRowInsert.size) {
        println("La nueva columna debe tener ${finalMatrixAfterRowInsert.size} elementos. Intente de nuevo:")
        columnInput.fill(0) // Reiniciar el array
        val newColumnInput = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
        columnInput = newColumnInput
    }

    do {
        println("Ingrese el índice para insertar la nueva columna (0 a $newM):")
        y = readLine()!!.toInt()
    } while (y < 0 || y > newM)

    val finalMatrix = Array(finalMatrixAfterRowInsert.size) { IntArray(newM + 1) }
    for (i in finalMatrix.indices) {
        for (j in 0 until finalMatrix[i].size) {
            if (j < y) {
                finalMatrix[i][j] = finalMatrixAfterRowInsert[i][j]
            } else if (j == y) {
                finalMatrix[i][j] = columnInput[i]
            } else {
                finalMatrix[i][j] = finalMatrixAfterRowInsert[i][j - 1]
            }
        }
    }

    println("Matriz final después de insertar la nueva columna en índice $y:")
    printMatrix(finalMatrix)
}

fun printMatrix(matrix: Array<IntArray>) {
    for (row in matrix) {
        println(row.joinToString(" "))
    }
}

fun EjercicioOcho() {
    println("Ejercicio 8")
    val scanner = Scanner(System.`in`)

    var N: Int
    do {
        print("Introduce el tamaño de la matriz (N): ")
        N = scanner.nextInt()
    } while (N <= 0)

    val matriz = Array(N) { IntArray(N) }

    println("Introduce los elementos de la matriz:")
    for (i in 0 until N) {
        for (j in 0 until N) {
            print("Elemento [$i][$j]: ")
            matriz[i][j] = scanner.nextInt()
        }
    }

    println("\nMatriz original:")
    for (i in 0 until N) {
        for (j in 0 until N) {
            print("${matriz[i][j]} \t")
        }
        println()
    }

    for (i in 0 until N) {
        for (j in 0 until N) {
            if (matriz[i][j] < 0) {
                matriz[i][j] = 0 // Si es negativo, cambiar a 0
            } else if (matriz[i][j] > 0) {
                matriz[i][j] = 9 // Si es positivo, cambiar a 9
            }
        }
    }

    println("\nMatriz cambiada:")
    for (i in 0 until N) {
        for (j in 0 until N) {
            print("${matriz[i][j]} \t")
        }
        println()
    }
}

fun EjercicioNueve() {
    println("Ejercicio 9")
    println("Ingrese el número de sucursales (N):")
    val N = readLine()!!.toInt()

    val ventas = Array(N) { IntArray(12) }

    for (i in 0 until N) {
        println("Ingrese las ventas para la sucursal ${i + 1}:")
        for (j in 0 until 12) {
            ventas[i][j] = readLine()!!.toInt()
        }
    }

    var totalVentas = 0
    val totalPorSucursal = IntArray(N)
    var maxVentas = 0
    var sucursalMax = -1
    val ventasPorMes = IntArray(12)

    for (i in 0 until N) {
        for (j in 0 until 12) {
            totalVentas += ventas[i][j]
            totalPorSucursal[i] += ventas[i][j]
            ventasPorMes[j] += ventas[i][j]

            if (totalPorSucursal[i] > maxVentas) {
                maxVentas = totalPorSucursal[i]
                sucursalMax = i
            }
        }
    }

    var minVentasMes = ventasPorMes[0]
    var mesMin = 0
    for (j in 1 until 12) {
        if (ventasPorMes[j] < minVentasMes) {
            minVentasMes = ventasPorMes[j]
            mesMin = j
        }
    }

    println("Total de ventas de la compañía: $totalVentas")
    for (i in 0 until N) {
        println("Total de ventas de la sucursal ${i + 1}: ${totalPorSucursal[i]}")
    }
    println("Sucursal que más vendió: Sucursal ${sucursalMax + 1} con ${maxVentas} en total.")
    println("Mes que menos vendió: Mes ${mesMin + 1} con ${ventasPorMes[mesMin]} en total.")
}

fun EjercicioDiez() {
    println("Ejercicio 10")
    val scanner = Scanner(System.`in`)

    print("Introduce el número de estudiantes (M): ")
    val M = scanner.nextInt()

    val materias = 6 // Sabemos que son 6 materias (columnas)
    val calificaciones = Array(M) { DoubleArray(materias) }

    println("Introduce las calificaciones de cada estudiante para las 6 materias:")
    for (i in 0 until M) {
        println("Estudiante ${i + 1}:")
        for (j in 0 until materias) {
            print("  Materia ${j + 1}: ")
            calificaciones[i][j] = scanner.nextDouble()
        }
    }

    println("\nPromedio de cada estudiante:")
    for (i in 0 until M) {
        var sumaEstudiante = 0.0
        for (j in 0 until materias) {
            sumaEstudiante += calificaciones[i][j]
        }
        val promedioEstudiante = sumaEstudiante / materias
        println("Estudiante ${i + 1}: Promedio = %.2f".format(promedioEstudiante))
    }

    val notaAprobacion = 3.0

    for (j in 0 until materias) {
        var aprobados = 0
        var reprobados = 0

        for (i in 0 until M) {
            if (calificaciones[i][j] >= notaAprobacion) {
                aprobados++
            } else {
                reprobados++
            }
        }

        println("\nMateria ${j + 1}:")
        println("  Aprobados: $aprobados")
        println("  Reprobados: $reprobados")
    }


    println("\nPromedio de cada materia:")
    for (j in 0 until materias) {
        var sumaMateria = 0.0
        for (i in 0 until M) {
            sumaMateria += calificaciones[i][j]
        }
        val promedioMateria = sumaMateria / M
        println("Materia ${j + 1}: Promedio = %.2f".format(promedioMateria))
    }
}

fun EjercicioOnce() {
    println("Ejercicio 11")
    val empleados = mutableListOf<Empleado>()
    val sueldoNormal = 2350
    val sueldoExtra = 3500
    val diasDeLaSemana = 7

    println("Ingrese el número de empleados:")
    val numEmpleados = readLine()!!.toInt()

    for (i in 1..numEmpleados) {
        println("Empleado $i:")
        print("Código del empleado (1-100): ")
        val codigo = readLine()!!.toInt()

        print("Horas trabajadas en horario normal (total $diasDeLaSemana días): ")
        val horasNormales = readLine()!!.toInt()

        print("Horas trabajadas en sobre tiempo: ")
        val horasExtra = readLine()!!.toInt()

        empleados.add(Empleado(codigo, horasNormales, horasExtra))
    }

    println("\nInforme de sueldos:")
    for (empleado in empleados) {
        val pagoNormal = empleado.horasNormales * sueldoNormal
        val pagoExtra = empleado.horasExtra * sueldoExtra
        val total = pagoNormal + pagoExtra

        println("Código: ${empleado.codigo}, " +
                "Horas Normales: ${empleado.horasNormales}, " +
                "$ por Horas Normales: $pagoNormal, " +
                "Horas Extra: ${empleado.horasExtra}, " +
                "$ por Horas Extra: $pagoExtra, " +
                "Total: $total")
    }
}

class Empleado(
    val codigo: Int,
    val horasNormales: Int,
    val horasExtra: Int
)

fun EjercicioDoce(){
    println("Ejercicio 12")
    val scanner = Scanner(System.`in`)

    print("Introduce el valor de N (impar y mayor que 3): ")
    val N = scanner.nextInt()

    if (N <= 3 || N % 2 == 0) {
        println("N debe ser impar y mayor que 3.")
        return
    }

    val matrix = Array(N) { IntArray(N) { 4 } }

    for (i in 1 until N-1) {
        matrix[0][i] = 1
        matrix[N-1][i] = 1
    }

    matrix[1][N/2] = 1
    matrix[N-2][N/2] = 1

    for (row in matrix) {
        for (element in row) {
            print("$element ")
        }
        println()
    }
}

fun EjercicioTrece(N: Int){
    println("Ejercicio 13")
    if (N % 2 != 1 || N <= 3) {
        println("N debe ser un número impar mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) { 0 } }

    for (i in 0 until N) {
        matriz[0][i] = 1
        matriz[N - 1][i] = 1
    }

    for (i in 0 until N) {
        matriz[i][0] = 1
        matriz[i][N - 1] = 1
    }

    for (fila in matriz) {
        println(fila.joinToString(" "))
    }
}

fun EjercicioCatorce(){
    println("Ejercicio 14")
    val scanner = Scanner(System.`in`)

    print("Introduce el valor de N (impar y mayor que 3): ")
    val N = scanner.nextInt()

    if (N <= 3 || N % 2 == 0) {
        println("N debe ser impar y mayor que 3.")
        return
    }

    val matrix = Array(N) { IntArray(N) }
    var value = 1

    var top = 0
    var bottom = N - 1
    var left = 0
    var right = N - 1

    while (top <= bottom && left <= right) {
        for (i in right downTo left) {
            matrix[top][i] = value++
        }
        top++

        for (i in top..bottom) {
            matrix[i][left] = value++
        }
        left++

        for (i in left..right) {
            matrix[bottom][i] = value++
        }
        bottom--

        for (i in bottom downTo top) {
            matrix[i][right] = value++
        }
        right--
    }

    for (row in matrix) {
        for (element in row) {
            print("$element ")
        }
        println()
    }
}

fun EjercicioQuince(N: Int){
    println("Ejercicio 15")
    if (N % 2 != 1 || N <= 3) {
        println("N debe ser un número impar mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) }

    var num = 1

    for (d in 0 until 2 * N - 1) {
        if (d % 2 == 0) {
            var i = minOf(d, N - 1)
            var j = d - i
            while (i >= 0 && j < N) {
                matriz[i][j] = num
                num++
                i--
                j++
            }
        } else {
            var j = minOf(d, N - 1)
            var i = d - j
            while (j >= 0 && i < N) {
                matriz[i][j] = num
                num++
                i++
                j--
            }
        }
    }

    for (fila in matriz) {
        for (valor in fila) {
            print("$valor\t")
        }
        println()
    }
}

fun EjercicioDieciseis(){
    println("Ejercicio 16")
    val scanner = Scanner(System.`in`)

    print("Introduce el valor de N (impar y mayor que 3): ")
    val N = scanner.nextInt()

    if (N <= 3 || N % 2 == 0) {
        println("N debe ser impar y mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) }

    var num = 1

    for (d in 0 until N) {
        var i = 0
        var j = d
        while (j < N) {
            matriz[i][j] = num
            num++
            i++
            j++
        }
    }

    for (fila in matriz) {
        for (valor in fila) {
            print("$valor\t")
        }
        println()
    }
}

fun EjercicioDiecisiete(N: Int){
    println("Ejercicio 17")
    if (N % 2 != 1 || N <= 3) {
        println("N debe ser un número impar mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) }

    for (i in 0 until N) {
        matriz[0][i] = 1
        matriz[N - 1][i] = 1
    }

    for (i in 1 until N - 1) {
        matriz[i][N - 1 - i] = 1
    }

    for (fila in matriz) {
        println(fila.joinToString(" "))
    }
}

fun EjercicioDieciocho(){
    println("Ejercicio 18")
    val scanner = Scanner(System.`in`)

    print("Introduce el valor de N (impar y mayor que 3): ")
    val N = scanner.nextInt()

    if (N <= 3 || N % 2 == 0) {
        println("N debe ser impar y mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) }

    var num = 15

    for (d in N - 1 downTo 0) {
        var i = d
        var j = 0
        while (i < N) {
            matriz[i][j] = num
            num--
            i++
            j++
        }
    }

    for (fila in matriz) {
        for (valor in fila) {
            print("$valor\t")
        }
        println()
    }
}

fun EjercicioDiecinueve(n: Int){
    println("Ejercicio 19")
    if (n <= 3 || n % 2 == 0) {
        println("N debe ser un número impar mayor que 3")
        return
    }

    val matriz = Array(n) { IntArray(n) }
    var valor = n * n
    var fila = 0
    var columna = 0
    var direccion = 0 // 0: derecha, 1: abajo, 2: izquierda, 3: arriba

    while (valor > 0) {
        matriz[fila][columna] = valor
        valor--

        when (direccion) {
            0 -> if (columna + 1 < n && matriz[fila][columna + 1] == 0) columna++ else { direccion = 1; fila++ }
            1 -> if (fila + 1 < n && matriz[fila + 1][columna] == 0) fila++ else { direccion = 2; columna-- }
            2 -> if (columna - 1 >= 0 && matriz[fila][columna - 1] == 0) columna-- else { direccion = 3; fila-- }
            3 -> if (fila - 1 >= 0 && matriz[fila - 1][columna] == 0) fila-- else { direccion = 0; columna++ }
        }
    }

    for (fila in matriz) {
        for (elemento in fila) {
            print("%3d".format(elemento))
        }
        println()
    }
}

fun EjercicioVeinte(N: Int){
    println("Ejercicio 20")
    if (N % 2 != 1 || N <= 3) {
        println("N debe ser un número impar mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) }

    var valor = 1
    var filaInicio = 0
    var filaFin = N - 1
    var colInicio = 0
    var colFin = N - 1

    while (filaInicio <= filaFin && colInicio <= colFin) {
        for (i in colInicio..colFin) {
            matriz[filaInicio][i] = valor++
        }
        filaInicio++

        for (i in filaInicio..filaFin) {
            matriz[i][colFin] = valor++
        }
        colFin--

        if (filaInicio <= filaFin) {
            for (i in colFin downTo colInicio) {
                matriz[filaFin][i] = valor++
            }
            filaFin--
        }

        if (colInicio <= colFin) {
            for (i in filaFin downTo filaInicio) {
                matriz[i][colInicio] = valor++
            }
            colInicio++
        }
    }

    for (fila in matriz) {
        println(fila.joinToString(" "))
    }
}