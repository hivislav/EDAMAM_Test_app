package ru.hivislav.edamamtestapp.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import ru.hivislav.edamamtestapp.databinding.FragmentMenuBinding
import ru.hivislav.edamamtestapp.domain.entities.Hint
import ru.hivislav.edamamtestapp.presentation.adapters.MenuFragmentAdapter
import ru.hivislav.edamamtestapp.presentation.viewmodel.MenuViewModel

class MenuFragment : Fragment() {

    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MenuViewModel by lazy {
        ViewModelProvider(this)[MenuViewModel::class.java]
    }

    private val adapter = MenuFragmentAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerViewMenuFragment.adapter = adapter
        viewModel.getLiveData().observe(viewLifecycleOwner) {
            renderData(it)
        }
        viewModel.getFoodList()
    }

    private fun renderData(hintList: List<Hint>?) {
        adapter.submitList(hintList)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance() = MenuFragment()
    }
}