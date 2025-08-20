package org.upskillher.web.maps;

import org.openqa.selenium.By;

public class ReservationPageMaps {
    /*  //h2[text()='Room Features']
            //busca en cualquier parte del documento
            h2[text()='Room Features'] encuentra el elemento h2 que contiene exactamente el texto "Room Features"
        /following-sibling::div
            following-sibling:: selecciona los elementos hermanos que vienen después del h2
            div especifica que queremos solo los divs hermanos
        //span
            // busca en todos los niveles de profundidad dentro del div encontrado
            span selecciona todos los elementos span
    * */
    public static final By ROOM_FEATURES = By.xpath("//h2[text()='Room Features']/following-sibling::div//span");
}
