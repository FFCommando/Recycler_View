package com.example.recyclerview.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.recyclerview.R;
import com.example.recyclerview.model.Student;
import java.util.List;

public class RecyclerViewAdapter extends  RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    List<Student> studentList;
    Context context;

    public RecyclerViewAdapter(List<Student> studentList, Context context) {
        this.studentList = studentList;
        this.context = context;
    }

    @NonNull

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Student student=studentList.get(position);
        holder.txtName.setText(student.getName());
        holder.txtRollNo.setText(student.getRollNo());
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{

        TextView txtName,txtRollNo;
        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            txtName=itemView.findViewById(R.id.Student_Name);
            txtRollNo=itemView.findViewById(R.id.Roll_no);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(context,studentList.get(getAdapterPosition()).getName(), Toast.LENGTH_LONG).show();
        }
    }

}

