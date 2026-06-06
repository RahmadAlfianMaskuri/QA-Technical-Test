# QA Technical Test

Project ini dibuat menggunakan **Katalon Studio** untuk melakukan validasi proses booking menggunakan data dummy repository.

## Prerequisites

Pastikan environment berikut sudah terinstall:

* Katalon Studio 10.x atau versi yang kompatibel
* Java Development Kit (JDK) yang didukung oleh Katalon
* Git (opsional, untuk clone repository)

## Clone Repository

```bash
git clone https://github.com/RahmadAlfianMaskuri/QA-Technical-Test.git
cd QA-Technical-Test
```

## Struktur Test Case

Project ini terdiri dari 4 test case utama:

| No | Test Case                        | Deskripsi                                                               |
| -- | -------------------------------- | ----------------------------------------------------------------------- |
| 1  | `01. TC_Validate_Double_Booking` | Memastikan sistem dapat mendeteksi kondisi double booking.              |
| 2  | `02. TC_Validate_Price`          | Memvalidasi perhitungan harga booking sesuai dengan data yang tersedia. |
| 3  | `03. TC_Booking_Available_Slot`  | Memastikan proses booking berhasil ketika slot masih tersedia.          |
| 4  | `04. TC_Booking_Duplicate_Slot`  | Memastikan sistem menolak booking pada slot yang sudah digunakan.       |

## Cara Menjalankan Test Case

### Melalui Katalon Studio

1. Buka **Katalon Studio**.
2. Pilih **File → Open Project**.
3. Arahkan ke folder project `QA-Technical-Test`.
4. Pada panel **Tests Explorer**, buka folder **Test Cases**.
5. Klik kanan pada test case yang ingin dijalankan.
6. Pilih **Run → Chrome** (atau browser lain yang tersedia).

### Menjalankan Semua Test Case

1. Buat **Test Suite** yang berisi seluruh test case.
2. Tambahkan test case berikut:

   * `01. TC_Validate_Double_Booking`
   * `02. TC_Validate_Price`
   * `03. TC_Booking_Available_Slot`
   * `04. TC_Booking_Duplicate_Slot`
3. Jalankan Test Suite menggunakan browser yang diinginkan.

## Test Data

Project menggunakan data dummy yang tersimpan pada custom keywords/repository berikut:

* `Keywords/repoDummy/BookingRepoDummy.groovy`
* `Keywords/repoDummy/ScheduleRepoDummy.groovy`

Data tersebut digunakan untuk mensimulasikan skenario booking tanpa ketergantungan pada database eksternal.

## Report

Hasil eksekusi test dapat dilihat pada folder:

```
Reports/
```

Katalon akan menghasilkan report secara otomatis setiap kali test dijalankan.

## Author

Rahmad Alfian Maskuri
