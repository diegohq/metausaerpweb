<?php

class NumberHelper {

    public static function numberTreatment($number) {

        $number = str_replace(',', '', $number);

        if (strpos($number, '.') === false) { // int
            return intval($number);
        }

        // float
        return floatval($number);
        
    }

}

?>