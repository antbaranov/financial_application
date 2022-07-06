class DinnerAdvisor {
    fun getAdvice(moneyBeforeSalary: Double, daysBeforeSalary: Int) {
        if (moneyBeforeSalary < 3000) {
            println("Сегодня лучше поесть дома. Экономьте - и вы дотянете до зарплаты!")
        } else if (moneyBeforeSalary < 10000) {
            if (daysBeforeSalary < 10) {
                println("Окей, пора в Макдак!")
            } else {
                println("Сегодня лучше поесть дома. Экономьте - и вы дотянете до зарплаты!")
            }
        } else if (moneyBeforeSalary < 30000) {
            if (daysBeforeSalary < 10) {
                println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)")
            } else {
                println("Окей, пора в Макдак!")
            }
        } else {
            if (daysBeforeSalary < 10) {
                println("Отлично! Заказывайте крабов!")
            } else {
                println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)")
            }
        }
    }
}