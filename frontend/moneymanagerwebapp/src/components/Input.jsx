const Input = ({ label, type, placeholder, value, onChange }) => {
    return (
        <div className="flex flex-col space-y-1">
            <label className="text-sm font-semibold text-slate-800">
                {label}
            </label>

            <input
                type={type}
                value={value}
                onChange={onChange}
                placeholder={placeholder}
                className="
          w-full bg-white border border-gray-300
          rounded-md p-2 text-gray-800
          focus:outline-none focus:border-blue-500
        "
            />
        </div>
    );
};

export default Input;

