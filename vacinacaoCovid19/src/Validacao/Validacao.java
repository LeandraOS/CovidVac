package Validacao;

import java.util.Arrays;
import java.util.List;

public class Validacao {
    public boolean validaProfissao(String profissao) {
        List<String> profissoes = Arrays.asList("MEDICO", "BIOMÉDICO", "ODONTOLOGO", "FISIOTERAPEUTA", "ENFERMEIRO", "PROFESSOR", "DENTISTA", "FARMACEUTICO", "POLICIAL");

        if (profissoes.contains(profissao)) {
            return true;
        }
        return false;
    }

    public  boolean validaComorbidade(String comorbidades) {
        List<String> comorbidadesValidas = Arrays.asList("fibrose cística", "fibrose pulmonar", "diabetes", "pneumoconioses", "displasia broncopulmonar", "asma", "hipertensão arterial", "insuficiência cardíaca",
                "cor-pulmonale", "hipertensão pulmonar", "hipertensão arterial", "cardiopatia hipertensiva", "síndrome coronarianas", "valvopatias", "miocardiopatias ", "pericardiopatias",
                "neurismas", "dissecções", "hematomas da aorta", "arritmias cardíacas", "problemas cardíacos", "acidente vascular cerebral", "demência vascular",
                "transplatado", "anemia", "sindrome de down", "cirrose hepática", "obesidade", "tuberculose");

        for (int i = 0; i < comorbidadesValidas.size(); i++) {
            if (comorbidadesValidas.contains(comorbidades)) {
                return true;
            }
        }
        return false;
    }
}
