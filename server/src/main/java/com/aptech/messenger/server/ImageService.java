package com.aptech.messenger.server;

/**
 * Хэрэглэгчийн зургыг боловсруулах зориулалт бүхий service
 * class
 */
public class ImageService {

	/**
	 * Зургын хэмжээг багасгах мөн jpeg төрөлрүү хувиргалт хийх зориулалт
	 * бүхий method юм. Уг method нь зурагын хэмжээг өөрчилхөөс өмнө нь
	 * заавал crop method-ын тусламжтай зургын хэмжээг багасгасан байна.
	 * @param image
	 */
	public byte[] resize(byte[] image) {
		// TODO - implement ImageService.resize
		throw new UnsupportedOperationException();
	}

	/**
	 * зургын хэмжээг яг тэгш хэмжээт дөрвөлжин болгож тайрах зориулалт
	 * бүхий method юм. Уг method нь зургын хамгийн бага талыг үндсэн
	 * хэмжээ болгон хамгын их талаас нь тайрах замаар тэгш хэмжээт
	 * дөрвөлжин болгоно. Зургыг тайрахдаа зургын гол хэсэгийг төвөө
	 * болгон урт талын 2 талаас тайралтаа хийнэ.
	 * @param image
	 */
	private byte[] crop(byte[] image) {
		// TODO - implement ImageService.crop
		throw new UnsupportedOperationException();
	}

}