package com.example.samojlov_av_homework_module_10_number_6

import android.widget.ImageView

class BodyMassIndex(val height: String, val weight: String) {
    private val heigthIn = height.toDouble() / 100
    private val weightIn = weight.toDouble()
    private val severeBodyWeightDeficiency =
        "Чаще всего в основе лечения этого заболевания лежит правильное питание, которое предполагает:\n" +
                "увеличение калорийности потребляемых продуктов: введение в рацион большего количества жирного мяса, мясных бульонов, кисломолочных продуктов (сметаны, сливок, молока), хлебобулочных изделий и продуктов с большим количеством углеводов;\n" +
                "соблюдение баланса: увеличение калорийности пищи не исключает из рациона овощи и фрукты как основной источник витаминов;\n" +
                "возможное сокращение объема порций при увеличении количества приемов пищи (до 4-5 раз в день). При этом процесс приема пищи должен проходить в спокойной обстановке (исключаются быстрые перекусы).\n" +
                "В некоторых случаях, особенно при дефиците веса у женщин, вызванном психологическими факторами, изменение рациона питания может проходить под наблюдением психолога, который помогает пациентам справиться с фобиями, связанными с едой.\n" +
                "Помимо диеты восполнение недостатка веса предполагает физическую активность, которая имеет целью вернуть утраченную мышечную массу, а также достаточный сон и отдых.\n" +
                "В некоторых случаях лечение указанного заболевания также предполагает прием препаратов, чаще всего при обнаружении гормонального дисбаланса. При этом прием гормональных препаратов необходимо осуществлять только под наблюдением врача.\n" +
                "При соблюдении рекомендаций врача по питанию и физической активности пациентам удается компенсировать недостаток веса и избежать серьезных осложнений. Сроки лечения во многом зависят от стадии болезни, а также от сопутствующих проблем, в том числе психологических.\n" +
                "Профилактика указанного заболевания предполагает:\n" +
                "достаточное, регулярное, сбалансированное питание, особенно во время беременности;\n" +
                "умеренные физические нагрузки;\n" +
                "сокращение стрессовых ситуаций, отказ от вредных привычек;\n" +
                "профилактическая проверка уровня гормонов, а также профилактические осмотры на предмет заболеваний желудочно-кишечного тракта и эндокринной системы;\n" +
                "при обнаружении недостаточного веса необходимо обратиться к специалисту и пройти обследование."
    private val standard =
        "Такой вес считается идеальным и не несет опасности для здоровья. Худеть или поправляться при таком весе не стоит, однако некоторые корректировки фигуры в косметических целях желательно. Если при таком весе обхват талии у вас превышает 80 см, то вероятно появление избыточного веса в будущем. В этом случае необходимо заниматься физическими упражнениями для развития мышечной массы."
    private val overweight =
        "Постарайтесь срочно избавиться от него, поскольку при таком ИМТ возникает риск развития заболеваний сердечно-сосудистых системы, диабета. Часто отмечается повышенное давление. Рекомендуем при таком ИМТ поменять образ жизни, придерживаться диеты и отказаться от употребления жирных, сладких и высококалорийных продуктов. Много времени уделяйте физическим упражнениям, ходьбе и бегу."
    private val obesityOfTheFirstDegree =
        "Ожирение – это опасное заболевание, оно говорит о высоком содержании жира в организме. Если вы измерите давление, то наверняка оно у вас выше нормы, вы очень быстро устаете, предпочитаете сидеть в автобусе или во время беседы. Вам трудно уснуть, потому что вы чувствуете себя голодным. Срочно начинайте заниматься собой, выберите подходящую для вас диету и образ жизни. Питание, свой вес и занятия спортом строго контролируйте. Не позволяйте себе поддаваться лени и не ищите причины, по которым у вас нет времени заниматься собой. Здоровье важнее всего, а вам как раз и пора задуматься об этом. У вас большой риск развития сердечно-сосудистых заболеваний, диабета и болезней ног."
    private val obesityOfTheSecondDegree =
        "Настоятельно рекомендуем срочно снизить вес, если не можете самостоятельно обратитесь к диетологам. Начинайте посещать оздоровительные курсы для снижения веса, покупайте диски с программой для самостоятельного снижения веса, посещайте спорт-клубы. Постепенно уменьшайте количество потребляемой пищи, считайте калории и записывайте их. Для женщин количество потребляемой калорий должно составлять 1000-1500 ккал. в день. Старайтесь добиться отказа от употребления пищи больше этой нормы. При таком ИМТ резко возрастает риск развития болезней, приводящих к преждевременной смерти."
    private val obesityOfTheThirdDegree =
        "К сожалению, похудеть самостоятельно при таком ожирении очень трудно, так как уже произошли непоправимые изменения в организме. Страдают от ожирения все органы, в первую очередь сердце, почки, опорно-двигательный аппарат. Наблюдается одышка, проблемы при ходьбе с ногами, невозможно согнуться. Лечение ожирения III степени необходимо проводить под наблюдением врача-диетолога, а самостоятельно необходимо стараться снизить вес до более приемлемых показателей. Попробуйте ходить не менее двух часов пешком быстрым ходом, если позволяет вам здоровье."

    private val indexName = listOf(
        "Выраженный дефицит массы тела",
        "Недостаточная (дефицит) масса тела",
        "Норма",
        "Избыточная масса тела (предожирение)",
        "Ожирение 1 степени",
        "Ожирение 2 степени",
        "Ожирение 3 степени"
    )
    private val indexData = mapOf(
        indexName[0] to severeBodyWeightDeficiency,
        indexName[1] to severeBodyWeightDeficiency,
        indexName[2] to standard,
        indexName[3] to overweight,
        indexName[4] to obesityOfTheFirstDegree,
        indexName[5] to obesityOfTheSecondDegree,
        indexName[6] to obesityOfTheThirdDegree
    )

    fun index(): String {
        val index = weightIn / (heigthIn * heigthIn)
        return index.toString()
    }

    fun indexNameCalculate(): String {
        var name = ""
        when {
            index().toDouble() <= 16.0 -> name = indexName[0]
            index().toDouble() > 16.0 && index().toDouble() <= 18.5 -> name = indexName[1]
            index().toDouble() > 18.5 && index().toDouble() <= 25.0 -> name = indexName[2]
            index().toDouble() > 25.0 && index().toDouble() <= 30.0 -> name = indexName[3]
            index().toDouble() > 30.0 && index().toDouble() <= 35.0 -> name = indexName[4]
            index().toDouble() > 35.0 && index().toDouble() <= 40.0 -> name = indexName[5]
            index().toDouble() > 40.0  -> name = indexName[6]
            else -> "Некорректные данные"
        }
        return name
    }

    fun indexPrint(): String {
        return "Индекс массы тела: ${index()}\n\n${indexNameCalculate()}"
    }

    fun recommendations(): String?{
        val recomend = indexData[indexNameCalculate()]
        return recomend
    }

    fun imageIndex(image: ImageView){
        when(indexNameCalculate()){
            indexName[0] -> image.setImageResource(R.drawable.one)
            indexName[1] -> image.setImageResource(R.drawable.one)
            indexName[2] -> image.setImageResource(R.drawable.two)
            indexName[3] -> image.setImageResource(R.drawable.three)
            indexName[4] -> image.setImageResource(R.drawable.four)
            indexName[5] -> image.setImageResource(R.drawable.five)
            indexName[6] -> image.setImageResource(R.drawable.five)
        }
    }
}