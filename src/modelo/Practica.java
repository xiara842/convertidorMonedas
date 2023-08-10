package modelo;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Practica {

	public static void main(String[] args) {

		String[] opciones;
		opciones = new String[2];
		opciones[0] = "Conversor de Moneda";
		opciones[1] = "Conversor de Temperatura";

		JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu", -1, null, opciones, args);

		String cantidad = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir:", null);
		int numCantidad = 0;
		try {
			numCantidad = Integer.parseInt(cantidad);

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "no puede introducir letras");
			System.exit(0);

		}

		String[] monedas = new String[10];
		monedas[0] = "De pesos a Dolar";
		monedas[1] = "De pesos a Euro";
		monedas[2] = "De pesos a Yen";
		monedas[3] = "De pesos a Won Coreano";
		monedas[4] = "De Dolar a Pesos";
		monedas[5] = "De Euro a pesos";
		monedas[6] = "De yen a Pesos";
		monedas[7] = "De Won Coreano a Pesos";

		Object conversion = JOptionPane.showInputDialog(null, "elija la moneda a la que deseas convertir tu dinero",
				null, 0, null, monedas, null);
		double resultado = 0;
		String tipoMoneda = null;

		if (conversion == monedas[0]) {
			resultado = numCantidad / 56.35;
			tipoMoneda = " Dolar";
		}
		if (conversion == monedas[1]) {
			resultado = numCantidad / 61.67;
			tipoMoneda = " Euro";
		}
		if (conversion == monedas[2]) {
			resultado = numCantidad / 0.39;
			tipoMoneda = " Yen";
		}
		if (conversion == monedas[3]) {
			resultado = numCantidad / 0.043;
			tipoMoneda = " Won Coreano";
		}
		if (conversion == monedas[4]) {
			resultado = numCantidad * 56.35;
			tipoMoneda = " Pesos";
		}
		if (conversion == monedas[5]) {
			resultado = numCantidad * 61.67;
			tipoMoneda = " Pesos";
		}
		if (conversion == monedas[6]) {
			resultado = numCantidad * 0.39;
			tipoMoneda = " Pesos";
		}
		if (conversion == monedas[7]) {
			resultado = numCantidad * 0.043;
			tipoMoneda = " Pesos";
		}

		DecimalFormat decimalFormat = new DecimalFormat("0.00");

		JOptionPane.showMessageDialog(null, "usted tiene $ " + decimalFormat.format(resultado) + tipoMoneda, "Message",
				1, null);

	}

}
