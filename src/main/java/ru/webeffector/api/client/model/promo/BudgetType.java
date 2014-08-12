package ru.webeffector.api.client.model.promo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import ru.webeffector.api.client.util.deserializer.BudgetTypeDeserializer;

/**
 * @author Ernest Sadykov
 * @since 08.08.2014
 */
@JsonDeserialize(using = BudgetTypeDeserializer.class)
public enum BudgetType {

    NoData                      ("Н/Д", "Нет данных"),

    SuperLowFreq_SuperLowComp   ("сНЧ сНК", "Сверхнизкочастотный, сверхнизкоконкурентный"),
    SuperLowFreq_LowComp        ("сНЧ НК", "Сверхнизкочастотный, низкоконкурентный"),
    SuperLowFreq_MediumComp     ("сНЧ СК", "Сверхнизкочастотный, среднеконкурентный"),
    SuperLowFreq_HighComp       ("сНЧ ВК", "Сверхнизкочастотный, высококонкурентный"),
    SuperLowFreq_SuperHighComp  ("сНЧ сВК", "Сверхнизкочастотный, сверхвысококонкурентный"),

    LowFreq_SuperLowComp        ("НЧ сНК", "Низкочастотный, сверхнизкоконкурентный"),
    LowFreq_LowComp             ("НЧ НК", "Низкочастотный, низкоконкурентный"),
    LowFreq_MediumComp          ("НЧ СК", "Низкочастотный, среднеконкурентный"),
    LowFreq_HighComp            ("НЧ ВК", "Низкочастотный, высококонкурентный"),
    LowFreq_SuperHighComp       ("НЧ сВК", "Низкочастотный, сверхвысококонкурентный"),

    MediumFreq_SuperLowComp     ("СЧ сНК", "Среднечастотный, сверхнизкоконкурентный"),
    MediumFreq_LowComp          ("СЧ НК", "Среднечастотный, низкоконкурентный"),
    MediumFreq_MediumComp       ("СЧ СК", "Среднечастотный, среднеконкурентный"),
    MediumFreq_HighComp         ("СЧ ВК", "Среднечастотный, высококонкурентный"),
    MediumFreq_SuperHighComp    ("СЧ сВК", "Среднечастотный, сверхвысококонкурентный"),

    HighFreq_SuperLowComp       ("ВЧ сНК", "Высокочастотный, сверхнизкоконкурентный"),
    HighFreq_LowComp            ("ВЧ НК", "Высокочастотный, низкоконкурентный"),
    HighFreq_MediumComp         ("ВЧ СК", "Высокочастотный, среднеконкурентный"),
    HighFreq_HighComp           ("ВЧ ВК", "Высокочастотный, высококонкурентный"),
    HighFreq_SuperHighComp      ("ВЧ сВК", "Высокочастотный, сверхвысококонкурентный"),

    SuperHighFreq_SuperLowComp  ("сВЧ сНК", "Сверхвысокочастотный, сверхнизкоконкурентный"),
    SuperHighFreq_LowComp       ("сВЧ НК", "Сверхвысокочастотный, низкоконкурентный"),
    SuperHighFreq_MediumComp    ("сВЧ СК", "Сверхвысокочастотный, среднеконкурентный"),
    SuperHighFreq_HighComp      ("сВЧ ВК", "Сверхвысокочастотный, высококонкурентный"),
    SuperHighFreq_SuperHighComp ("сВЧ сВК", "Сверхвысокочастотный, сверхвысококонкурентный")
    ;

    private String shortTitle;
    private String longTitle;

    BudgetType(String shortTitle, String longTitle) {
        this.shortTitle = shortTitle;
        this.longTitle = longTitle;
    }

    public static BudgetType fromShortTitle(String shortTitle) {
        for (BudgetType budgetType : BudgetType.values()) {
            if (budgetType.getShortTitle().equals(shortTitle)) {
                return budgetType;
            }
        }

        return NoData;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public String getLongTitle() {
        return longTitle;
    }

    @Override
    public String toString() {
        return longTitle;
    }
}
