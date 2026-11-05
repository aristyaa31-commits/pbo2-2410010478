package id.ac.uniska.pbo2.uts;

// Nama: ____________________
// NPM: _____________________

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class BarangTableModel extends AbstractTableModel {
    private final String[] kolom = {
        "Nama Barang", "Kategori", "Harga", "Jumlah", "Subtotal"
    };

    private final List<Barang> daftarBarang = new ArrayList<>();

    @Override
    public int getRowCount() {
        return daftarBarang.size();
    }

    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public String getColumnName(int column) {
        return kolom[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Lengkapi pengambilan data setiap kolom.
        return null;
    }

    // Tambahkan method untuk menambah barang dan menghitung:
    // total, diskon, serta jumlah bayar.
}
