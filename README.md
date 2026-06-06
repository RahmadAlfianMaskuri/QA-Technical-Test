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

Project ini memiliki 4 skenario pengujian:

| No | Test Case                        | Deskripsi                                                          |
| -- | -------------------------------- | ------------------------------------------------------------------ |
| 1  | `01. TC_Validate_Double_Booking` | Memastikan sistem dapat mendeteksi kondisi double booking.         |
| 2  | `02. TC_Validate_Price`          | Memvalidasi harga booking berdasarkan data schedule yang tersedia. |
| 3  | `03. TC_Booking_Available_Slot`  | Memastikan proses booking berhasil ketika slot masih tersedia.     |
| 4  | `04. TC_Booking_Duplicate_Slot`  | Memastikan sistem menolak booking pada slot yang sudah digunakan.  |

## Cara Menjalankan Test

### Menjalankan per Test Case (TC)

1. Buka **Katalon Studio**.
2. Pilih **File → Open Project**.
3. Buka folder project `QA Technical Test`.
4. Pada panel **Tests Explorer**, buka folder **Test Cases**.
5. Pilih salah satu test case berikut:

   * `01. TC_Validate_Double_Booking`
   * `02. TC_Validate_Price`
   * `03. TC_Booking_Available_Slot`
   * `04. TC_Booking_Duplicate_Slot`
6. Klik kanan pada test case yang dipilih.
7. Pilih **Run → Chrome** (atau browser lain yang tersedia).

### Menjalankan melalui Test Suite (TS)

Project ini menyediakan Test Suite untuk menjalankan seluruh test case secara berurutan.

1. Pada panel **Tests Explorer**, buka folder **Test Suites**.
2. Pilih Test Suite:

```text
Run All Test Case
```

3. Klik tombol **Run** pada browser yang diinginkan.
4. Katalon akan menjalankan seluruh test case yang terdaftar dalam Test Suite tersebut.

## Test Data

Project menggunakan data dummy yang tersimpan pada custom keywords berikut:

```text
Keywords/repoDummy/BookingRepoDummy.groovy
Keywords/repoDummy/ScheduleRepoDummy.groovy
```

Data tersebut digunakan untuk mensimulasikan skenario booking tanpa ketergantungan pada database eksternal.

## Report

Setelah Test Case atau Test Suite dijalankan, Katalon akan menghasilkan report secara otomatis.

Lokasi report dapat ditemukan pada folder:

```text
Reports/
```

Untuk eksekusi melalui Test Suite, report biasanya tersimpan pada struktur berikut:

```text
Reports/<Test Suite Name>/<Timestamp>/
```

File report yang dihasilkan dapat berupa:

* `report.html`
* `report.csv`
* `report.pdf`

## Author

Rahmad Alfian Maskuri
